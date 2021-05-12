package edu.xcdq.demo03;

/**
 * @author zhangshenrui
 * @date 2021/5/11 15:33
 */
public class ArrayAlg {
    // 求出通用的数据中间位置的值
    public static <T> T getMiddle(T[] a ) {
        return a[ a.length / 2 ];
    }

   /* public static String getMiddle(String[] a) {
        return a[a.length / 2 ];
    }*/

}
