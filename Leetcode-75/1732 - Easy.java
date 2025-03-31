class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int res=0;
        for(int i=0;i<gain.length;i++){
            res += gain[i];
            high = Math.max(high, res);
        }
        if(high<0) return 0;
        return high;
    }
}
