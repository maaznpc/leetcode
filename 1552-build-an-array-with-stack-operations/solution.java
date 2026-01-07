class Solution {
    public List<String> buildArray(int[] target, int n) {
        List <String> res=new ArrayList<>();
        int t=0;
        for(int i=0;i<n;i++){
            if(i+1==target[t]){
                res.add("Push");
                t++;
            }else{
                res.add("Push");
                res.add("Pop");
            }
            if(t>=target.length){
                    break;
            }
        }
        return res;
    }
}
