package cn.dgyong.solution;

/**
 * 原题：https://leetcode.cn/problems/reverse-integer/
 */
public class Solution7 {
    /**
     * 7. 整数反转
     * @param x
     * @return
     */
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            //拼接x尾部值
            n=n*10+x%10;
            //去掉尾部值
            x=x/10;
        }

        if(n>Integer.MAX_VALUE||n<Integer.MIN_VALUE){
            return 0;
        }
        return (int)n;
    }
    public int reverse2(int x) {
        int n=0;
        while(x!=0){
            //如果倒数第二位时已经超出极值/10的范围，必然溢出int，传入的原int参数x无需担心溢出
            if(n>Integer.MAX_VALUE/10||n<Integer.MIN_VALUE/10){
                return 0;
            }
            //拼接x尾部值
            n=n*10+x%10;
            //去掉尾部值
            x=x/10;
        }


        return n;
    }
}
