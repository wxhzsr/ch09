package edu.xcdq.demo04;

import java.util.ArrayList;

/**
 * @author zhangshenrui
 * @date 2021/5/11 16:06
 */
public class Demo04 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Circle circle = new Circle();
        canvas.draw(circle);

        // 定义多个形状，组成一个数组列表，传入
        Circle circle1 = new Circle();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Circle circle2 = new Circle();
        // 准备一个集合
        ArrayList<Shape> list = new ArrayList<>();
        list.add(circle1);
        list.add(rectangle);
        list.add(rectangle1);
        list.add(circle2);
        canvas.drawAll(list);


    }
}
