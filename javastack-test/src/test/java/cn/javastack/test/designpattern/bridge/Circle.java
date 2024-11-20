package cn.javastack.test.designpattern.bridge;

/**
 * 圆形
 * 公众号：Java技术栈
 */
public class Circle implements Shape {

    @Override
    public String draw() {
        return "圆形";
    }

}