class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque <Integer> stack=new ArrayDeque<>();
        int max=0;
        stack.push(-1);
        for (int i=0;i<=heights.length;i++){
            int ch=(i==heights.length)? 0 : heights[i];
            while(stack.peek()!=-1&&ch<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                max = Math.max(max, height * width);

            }
        stack.push(i);
        }
    return max;
    }
}
