class Solution {
    public boolean stoneGameIX(int[] stones) {
        int [] cnt= new int[3];
        for(int stone: stones){
            cnt[stone %3]++;
        }
        if(cnt[1]==0 || cnt[2]==0){
            return Math.max(cnt[1],cnt[2])>2 && cnt[0]%2==1;
        }
        return Math.abs(cnt[1]-cnt[2])>2 || cnt[0]%2==0;
    }
}
