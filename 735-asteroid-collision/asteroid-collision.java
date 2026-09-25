class Solution {
    public int[] asteroidCollision(int[] a) {
        List<Integer> s = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int m = 0 , n = 0 , y = 0;
        for(int x : a){
            if(st.isEmpty()) st.push(x);
            else{
                boolean alive = true;
                while(!st.isEmpty() && st.peek() > 0 && x < 0){
                    m = Math.abs(st.peek());
                    y = Math.abs(x);
                    if(y==m){
                        st.pop();
                        alive = false;
                        break;
                    }
                    else if(y>m) {
                        st.pop();
                    }
                    else{
                        alive = false;
                        break;
                    }
                }
                if(alive){
                    st.push(x);
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size()-1 ;i>= 0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}