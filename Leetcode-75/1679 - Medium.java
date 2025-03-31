class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int i=0, j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==k){
                c++;
                i++;j--;
            }
            else if(sum<k){
                i++;
            }
            else j--;
        }
        return c;
    }
}
