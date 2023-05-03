package cn.dgyong.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 原题：https://leetcode.cn/problems/zigzag-conversion/
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        //仅1行直接返回
        if (numRows<2)return s;
        //每行生成一个构造器添加字符串
        List<StringBuilder> rows=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i=0,flag=-1;
        //遍历字符串按行进行构造器拼接
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            //到达边界点开始反向
            if(i==0||i==numRows-1)flag=-flag;
            i+=flag;
        }
        //归纳字符串
        StringBuilder res=new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
