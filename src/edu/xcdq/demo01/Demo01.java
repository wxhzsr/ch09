package edu.xcdq.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshenrui
 * @date 2021/5/11 15:10
 */
public class Demo01 {
    public static void main(String[] args) {
        // 为了解决通用性的问题，jdk提供了封装好的集合，但是集合可以存放不同类型的数据
        List list = new ArrayList();
        list.add("111");
        list.add(111);
        list.add(true);
        list.add(11.1);
        System.out.println(list);
        // 加入泛型，做约束
        ArrayList<String> alist = new ArrayList<>();
        alist.add("111");
        //alist.add(111); 加入了泛型，不可以存储泛型之外的数据类型





    }
}
