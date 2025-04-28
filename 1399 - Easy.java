class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int c=0,max=0;

        for(int i=1;i<=n;i++){
            int sum = digitSum(i);
            mpp.put(sum, mpp.getOrDefault(sum,0)+1);
            max = Math.max(max, mpp.get(sum));
        }

        for(int size : mpp.values()){
            if(size==max){
                c++;
            }
        }
        return c;
    }

    private int digitSum(int num){
        int sum =0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
