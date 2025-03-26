class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char[] p = s.toCharArray();
        char[] r = t.toCharArray();
        while(i<s.length() && j<t.length()){
                if(p[i]==r[j]){
                    i++;
                }
                j++;
            }
        
        return i==s.length();
    }
}
