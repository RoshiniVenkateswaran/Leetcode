class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        int len=0;

        while(right < s.length()){
            if(mpp.containsKey(s.charAt(right))){
                left = Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}
