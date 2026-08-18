class Solution {
    public String firstPalindrome(String[] words) {
        for(String c : words){
            if(palin(c)) return c;
        }
        return "";
    }
    public static boolean palin(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}