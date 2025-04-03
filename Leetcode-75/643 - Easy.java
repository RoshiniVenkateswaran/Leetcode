class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1;
        int sum=0;
        
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        int max=sum;
    
        while(r<nums.length-1){
            sum=sum-nums[l];
            r++; l++;
            sum=sum+nums[r];
            max = Math.max(sum, max);
        }
            
        return (double) max/k;
    }
}
 
