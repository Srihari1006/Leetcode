class Solution {
    public boolean rotateString(String s, String goal) {
        return (goal+goal).indexOf(s)!=-1;
    }
}