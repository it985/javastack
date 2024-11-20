package cn.javastack.test.designpattern.bridge;

/**
 * 长方形
 * 公众号：Java技术栈
 */
public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "长方形";
    }

}