class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        subSet(li,nums,0,c);
        return li;
    }
    public static void subSet(List<List<Integer>> li,int[] nums,int p,List<Integer> c){
        if(p==nums.length){
            li.add(new ArrayList(c));
            return;
        }
        int d = nums[p];
        c.add(d);
        subSet(li,nums,p+1,c);
        c.remove(c.size()-1);
        subSet(li,nums,p+1,c);
    }
}