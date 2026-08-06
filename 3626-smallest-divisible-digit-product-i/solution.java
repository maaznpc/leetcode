class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int ans =1;
            int rem=n;
            while(rem>0){
                ans *= (rem%10);
                rem=rem/10; 
            }
            if(ans%t==0){
                break;
            }
            n++;
        }
        return n;
    }
}
