class Solution {
    public boolean sumGame(String num) {
        int s = num.length();
        int l = 0;
        int r = 0;
        int d = 0;
        for(int i =0;i<s;i++){
            if(num.charAt(i)== '?'){
                if(i<s/2) l++;
                else r++;
            }
            else {
                if(i<s/2) d += num.charAt(i)-'0';
                else d -= num.charAt(i)-'0';
            }
        }
        if((l+r)%2==1)return true;
        return d != 9*(r-l)/2;
    }
}