class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int max=0;
        int i=0;
        while(i<n){
            int maxi=(n-i)*Math.min(height[i],height[n]);
            if(height[i]<height[n]){
                i++;
            }else{
                n--;
            }
            if(maxi>max){
                max=maxi;
            }
        }
        return max;
    }
}
