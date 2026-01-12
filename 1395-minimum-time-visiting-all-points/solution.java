class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int mintime=0;
        for(int i=1;i<points.length;i++){
            int a=points[i][0]-points[i-1][0];
            int b=points[i][1]-points[i-1][1];

            mintime+=Math.max(Math.abs(a),Math.abs(b));
        }
        return mintime;
    }
}
