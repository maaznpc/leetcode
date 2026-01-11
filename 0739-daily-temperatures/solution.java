class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int []ans=new int [temperatures.length];
        Deque <Integer> dq =new ArrayDeque<>();
        
        for(int i=0;i<temperatures.length;i++){
            while(!dq.isEmpty()&&temperatures[i]>temperatures[dq.peek()]){
                ans[dq.peek()]=i-dq.pop();}
            dq.push(i);
        } 
          return ans;  
    }
}
