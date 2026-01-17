class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      Queue<Integer> q = new LinkedList<>();
      for(int i=0;i<tickets.length;i++){
        q.add(i);
      }
      int time=0;
      while(!q.isEmpty()){
        time++;
        int front=q.poll();
         tickets[front]--;
        if(k==front&&tickets[front]==0){
            return time;
        }
       
        if(tickets[front]!=0){
            q.add(front);
        }
      }
      return time;
    }
}
