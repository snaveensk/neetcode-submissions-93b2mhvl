class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int l= 0;
        int r =len-1;
        int temp =0;

        while (l<r){
            int temp2= (r-l )* Math.min(heights[l], heights[r]);
            temp = Math.max(temp2,temp);
            if (heights[l]< heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return temp;
    }
}
