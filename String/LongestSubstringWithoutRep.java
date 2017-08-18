/*
Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

public class LongestSubstringWithoutRep {
    public int lengthOfLongestSubstring(String str) {
       Set<Character> temp = new HashSet<>();
        int i=0,j=0,max=0;
        while(j < str.length()){
            if(!temp.contains(str.charAt(j))){
                temp.add(str.charAt(j++));
                max= Math.max(max,temp.size());
            }
            else
                temp.remove(str.charAt(i++));
        }
        return max;
    }
}