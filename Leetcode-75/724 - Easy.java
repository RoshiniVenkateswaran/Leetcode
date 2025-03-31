class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            rightsum = tot - leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
