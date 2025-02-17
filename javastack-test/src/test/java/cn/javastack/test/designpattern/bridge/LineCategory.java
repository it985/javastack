package cn.javastack.test.designpattern.bridge;

/**
 * 线条分类
 * 公众号：Java技术栈
 */
public class LineCategory extends Category {

    public LineCategory(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "线条分类，绘制：" + shape.draw();
    }

}