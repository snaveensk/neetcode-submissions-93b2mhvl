class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int longs =0;
        for (int num : set){
            if (!set.contains(num-1)){
                int temp =1;
                while (set.contains(num+temp)){
                    temp++;
                }
                longs = Math.max(longs,temp);
                
            }
        }
        return longs;
        
    }
}
