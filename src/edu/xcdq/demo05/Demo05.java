package edu.xcdq.demo05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshenrui
 * @date 2021/5/11 16:26
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List tempList = list ; // 泛型的擦除
        tempList.add(1213);
        System.out.println(tempList);


    }
}
