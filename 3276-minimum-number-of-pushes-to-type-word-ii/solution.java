class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        int arr[]=new int[26];
        for(char ch : word.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int pos=0;
        for(int i=25;i>=0;i--){
            if(arr[i]==0)
                break;
            
            ans += (arr[i]*(pos/8 + 1));
            pos++;
        }
        return ans;
    }
}
