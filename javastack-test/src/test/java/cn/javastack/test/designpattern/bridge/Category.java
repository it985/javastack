package cn.javastack.test.designpattern.bridge;

/**
 * 分类抽象类
 * 公众号：Java技术栈
 */

public abstract class Category {

    /**
     * 桥接的形状对象
     */
    protected Shape shape;

    public Category(Shape shape) {
        this.shape = shape;
    }

    /**
     * 抽象方法，由子类实现
     * @return
     */
    public abstract String draw();

}
