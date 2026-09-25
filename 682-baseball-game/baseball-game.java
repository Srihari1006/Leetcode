class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        int m = 0, n = 0 ,  l = 0;
        Stack<Integer> st = new Stack<>();
        for(String x : operations){
            if(x.equals("+")){
                if(!st.isEmpty())
                m = st.pop();
                if(!st.isEmpty())
                n = st.peek();
                st.push(m);
                st.push(m+n);
            }
            else if(x.equals("D")){
                if(!st.isEmpty()) st.push(st.peek()*2);
            }
            else if(x.equals("C")){
                if(!st.isEmpty()) st.pop();
            }
            else { l = Integer.parseInt(x);
            st.push(l);}
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}