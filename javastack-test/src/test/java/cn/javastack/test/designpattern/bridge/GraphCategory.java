package cn.javastack.test.designpattern.bridge;


/**
 * 图形分类
 * 公众号：Java技术栈
 */
public class GraphCategory extends Category {

    public GraphCategory(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "图形分类，绘制：" + shape.draw();
    }

}