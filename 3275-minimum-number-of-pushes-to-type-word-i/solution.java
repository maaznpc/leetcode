class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int res = 0;
        if(n<9){
            return n;
        }else if(n>8 && n<17){
            return (n-8)*2 + 8;
        }else if(n>16 && n<25){
            return (n-16)*3 + 24;
        }else{
            return (n-24)*4 + 48;
        }
    }
}
