package cn.javastack.test.designpattern.bridge;

/**
 * 曲线
 * 公众号：Java技术栈
 */
public class CurvedLine implements Shape {

    @Override
    public String draw() {
        return "曲线";
    }

}