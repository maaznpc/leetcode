class Solution {
    public int maximumLengthSubstring(String s) {
        int max =0;
       
       for(int start=0;start<s.length();start++){
           int []freq = new int[26];
           int count=0;
           for(int i =start ; i<s.length();i++){
               freq[s.charAt(i)-'a']++;
               if(freq[s.charAt(i)-'a']>2){ 
                   break;
               }
               count++;
           }
           max=Math.max(max,count);
       }
       return max;
    }
}
