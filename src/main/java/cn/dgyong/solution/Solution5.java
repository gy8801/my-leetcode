package cn.dgyong.solution;

/**
 * 题目https://leetcode.cn/problems/longest-palindromic-substring/
 */
public class Solution5 {
    /**
     * 5. 最长回文子串
     * 中心扩散
     */
    public String longestPalindrome(String s) {
        int strLength = s.length();
        if(strLength ==0){
            return "";
        }
        //最长子串长度
        int maxLength=1;
        //最长子串开始的下标
        int maxStart=0;
        //扩散坐标
        int left=0;
        int right=0;
        //子串长度
        int length=1;
        for (int i = 0; i < strLength; i++) {
            //初始做扩散坐标及长度
            left=i-1;
            right=i+1;
            length=1;
            //1是否可以左扩散
            while(left>=0&&s.charAt(left)==s.charAt(i)){
                left--;
                length++;
            }
            //2是否可以右扩散
            while (right<strLength&&s.charAt(right)==s.charAt(i)){
                right++;
                length++;
            }
            //3是否可以左右扩散
            while (left>=0&&right<strLength&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                length+=2;
            }
            //4记录最长子串
            if (length>maxLength){
                maxStart=left+1;
                maxLength=length;
            }
        }
        String maxSubStr=s.substring(maxStart,maxStart+maxLength);
        return maxSubStr;
    }
}
