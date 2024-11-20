package cn.javastack.test.designpattern.bridge;

/**
 * 绘制测试类
 * 公众号：Java技术栈
 */
public class DrawTest {

    public static void main(String[] args) {
        // 绘制图形
        draw(new GraphCategory(new Circle()));

        // 绘制长方形
        draw(new GraphCategory(new Rectangle()));

        // 绘制直线
        draw(new LineCategory(new StraightLine()));
    }

    public static void draw(Category category) {
        String result = category.draw();
        System.out.println(result);
    }

}
