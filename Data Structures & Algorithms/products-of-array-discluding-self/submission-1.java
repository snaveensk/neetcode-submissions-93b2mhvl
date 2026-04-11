class Solution {
    public int[] productExceptSelf(int[] nums) {

           int[] arr = new int[nums.length];
            int[] al = new int[nums.length];
            int[] ar = new int[nums.length];
            al[0] = nums[0];
            for (int i = 0; i<nums.length; i++){
                int temp =1;

                for (int j =i+1; j<nums.length; j++){
                    temp = temp * nums[j];
                }
                al[i] = temp;
            }

         System.out.println("right");
            for (int i =nums.length-1; i>=0; i--){
                int temp =1;
                for (int j = i-1; j >=0; j--){
                    temp = temp * nums[j];
                }
                ar[i] = temp;

            }
            for (int i =0; i<nums.length; i ++){
                arr[i] = al[i] * ar[i];
            }

            return arr;

        }
}  
