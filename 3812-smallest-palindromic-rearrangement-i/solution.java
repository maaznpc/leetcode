class Solution {
    public String smallestPalindrome(String s) {
        String ss=s.substring(0,s.length()/2);
        char arr[]=ss.toCharArray();
        Arrays.sort(arr);
        String firstpart = new String(arr);
        String secondpart = new StringBuilder(firstpart).reverse().toString();
        if(s.length()==1 || s.length()==2 ){
            return s;
        }else if(s.length()%2==0){
            return firstpart + secondpart;
        }else{
            char mid = s.charAt(s.length()/2);
            return firstpart + mid + secondpart;
        }

    }
}
