class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int[] ans = {-1,-1};
        int max = -1;
        for(int i = 0;i<towers.length;i++){
            int x1 = towers[i][0];
            int y1 = towers[i][1];
            int q = towers[i][2];
            if(Math.abs(x1-center[0])+Math.abs(y1-center[1]) <= radius){
                if(q>max){
                    max = q;
                    ans[0] = x1;
                    ans[1] = y1;
                }
                else if(q==max){
                    if((x1<ans[0])||( x1 == ans[0] && y1<ans[1])){
                    ans[0] = x1;
                    ans[1] = y1;
                    }
                }
            }
        }
        return ans;
    }
}