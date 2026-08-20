class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char c : s.toCharArray()) ans ^= c;
        for(char x : t.toCharArray()) ans ^= x;
        return ans;
    }
}