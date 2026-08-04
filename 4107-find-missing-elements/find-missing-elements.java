class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> s = new HashSet<>();
        for(int x :nums){
            min = Math.min(x,min);
            max = Math.max(x,max);
            s.add(x);
        }
        for(int i = min;i<= max;i++){
            if(!s.contains(i)) li.add(i);
        }
        return li;
    }
}