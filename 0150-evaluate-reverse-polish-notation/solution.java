class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack=new ArrayDeque<>();
        for(String token :tokens){
            if("+-*/".contains(token)){
                int a=stack.pop();
                int b=stack.pop();
                switch (token){
                    case ("+") -> stack.push(b+a);
                    case ("-") -> stack.push(b-a);
                    case ("*") -> stack.push(b*a);
                    case ("/") -> stack.push(b/a);
                }
            }else{
                stack.push(Integer.valueOf(token));
            }

        }
        return stack.peek();
    }
}
