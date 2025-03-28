class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandies=0;
        for(int i=0;i<candies.length;i++){
           if(maxCandies<candies[i]){
                maxCandies = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
           list.add(candies[i]+extraCandies >= maxCandies);
        }
        return list;
    }
}1
