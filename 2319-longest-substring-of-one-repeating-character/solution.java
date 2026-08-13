class Solution {

    class Node {
        char left;
        char right;

        int prefix;
        int suffix;
        int max;
        int length;
    }

    Node[] tree;

    public int[] longestRepeating(
        String s,
        String queryCharacters,
        int[] queryIndices
    ) {

        int n = s.length();

        tree = new Node[4 * n];

        build(s, 1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int j = 0; j < queryIndices.length; j++) {

            update(
                1,
                0,
                n - 1,
                queryIndices[j],
                queryCharacters.charAt(j)
            );

            ans[j] = tree[1].max;
        }

        return ans;
    }

    void build(String s, int node, int start, int end) {

        if (start == end) {

            tree[node] = new Node();

            char ch = s.charAt(start);

            tree[node].left = ch;
            tree[node].right = ch;

            tree[node].prefix = 1;
            tree[node].suffix = 1;
            tree[node].max = 1;
            tree[node].length = 1;

            return;
        }

        int mid = (start + end) / 2;

        build(s, node * 2, start, mid);
        build(s, node * 2 + 1, mid + 1, end);

        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }

    Node merge(Node a, Node b) {

        Node result = new Node();

        result.left = a.left;
        result.right = b.right;

        result.length = a.length + b.length;

        result.prefix = a.prefix;
        result.suffix = b.suffix;

        result.max = Math.max(a.max, b.max);

        if (a.right == b.left) {

            result.max = Math.max(
                result.max,
                a.suffix + b.prefix
            );

            if (a.prefix == a.length) {
                result.prefix = a.prefix + b.prefix;
            }

            if (b.suffix == b.length) {
                result.suffix = a.suffix + b.suffix;
            }
        }

        return result;
    }

    void update(
        int node,
        int start,
        int end,
        int index,
        char ch
    ) {

        if (start == end) {

            tree[node].left = ch;
            tree[node].right = ch;

            tree[node].prefix = 1;
            tree[node].suffix = 1;
            tree[node].max = 1;

            return;
        }

        int mid = (start + end) / 2;

        if (index <= mid) {

            update(
                node * 2,
                start,
                mid,
                index,
                ch
            );

        } else {

            update(
                node * 2 + 1,
                mid + 1,
                end,
                index,
                ch
            );
        }

        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }
}
