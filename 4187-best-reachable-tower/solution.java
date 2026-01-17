class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
    
      int bq=-1;
        int bx=-1;
        int by=-1;
        for(int i=0;i<towers.length;i++){
            int x=towers[i][0];
            int y=towers[i][1];
            int q=towers[i][2];
            int dis =Math.abs(x-center[0])+Math.abs(y-center[1]);
                if(dis<=radius&&(q>bq||(q==bq&&(x<bx||(y<by&&x==bx))))){
                    bq=q;
                    by=y;
                    bx=x;
                }
        }
        return new int[]{bx,by};
    }
}
