package edu.xcdq.demo04;

import java.util.List;

/**
 * @author zhangshenrui
 * @date 2021/5/11 16:03
 */
public class Canvas {
    // 在画布上画一个
    public void draw(Shape shape) {
        shape.xingzhuang();
    }
    // 在画布上画多个
    // List< ? extends Shape > 有限制的泛型
    public void drawAll (List< ? extends Shape > shapeList ) {
        for ( Shape s : shapeList ) {
            s.xingzhuang();
        }
    }


}
