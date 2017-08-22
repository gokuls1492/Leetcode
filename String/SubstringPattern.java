/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False
*/

class SubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null) return false;
        
        int len = s.length();
        for (int i=1; i<=len/2; i++){
            StringBuilder str = new StringBuilder();
            if (len%i==0){
                int m = len/i;
                String subString = s.substring(0,i);
                for (int j=0; j<m; j++){
                    str.append(subString);
                }
                if (s.equals(str.toString())) return true;
            }
        }
    return false;
    }
}