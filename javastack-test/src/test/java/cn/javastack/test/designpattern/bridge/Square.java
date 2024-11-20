package cn.javastack.test.designpattern.bridge;

/**
 * 正方形
 * 公众号：Java技术栈
 */
public class Square implements Shape {

    @Override
    public String draw() {
        return "正方形";
    }

}