/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
*/

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        int startIndex=0;
        int maxLen=1;
        boolean[][] palin = new boolean[n][n];
        for (int i=0;i<n;i++){
            palin[i][i] = true;
        }

        for (int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) {
                palin[i][i+1] = true;
                startIndex=i;
                maxLen=2;
            }
        }

        for (int cur=3; cur<=n; cur++){
            for (int i=0; i<n-cur+1 ;i++){
                int j= i+cur-1 ;
                if (s.charAt(i) == s.charAt(j) && palin[i+1][j-1]){
                    palin[i][j]= true;
                    startIndex=i;
                    maxLen=cur;
                }
            }
        }
        return s.substring(startIndex,maxLen+startIndex);
    }
}