class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int lsum=0, rsum=0, max=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];

        }
        max=lsum;      
        int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum +=  cardPoints[r]; 
            r--;
            max = Math.max(max,rsum+lsum);
        }
        return max;
    }
}
