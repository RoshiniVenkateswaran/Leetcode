class Solution {
    public int minimumOperations(int[] nums) {
        //custom hash table
        int[] hash = new int[101];
        for(int n : nums){
            hash[n]++;
        }
        int ans=0,i=0;
        
        while(!isDistinct(hash)){
            int c=3;
            while(i<nums.length && c-- >0){
                hash[nums[i]]--;
                i++;
            }
            ans++;
        }
        return ans;
    }


    private boolean isDistinct(int[] hash){
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1) return false;
        }
        return true;
    }
}
