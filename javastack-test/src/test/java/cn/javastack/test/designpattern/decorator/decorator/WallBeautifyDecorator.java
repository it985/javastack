package cn.javastack.test.designpattern.decorator.decorator;

import cn.javastack.test.designpattern.decorator.component.WallBeautify;

/**
 * 墙面装修装饰器角色
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public abstract class WallBeautifyDecorator implements WallBeautify {

    /**
     * 持有一个 Component 对象实例
     * @author: R哥
     * @from: 公众号：Java技术栈
     */
    private WallBeautify wallBeautify;

    public WallBeautifyDecorator(WallBeautify wallBeautify) {
        this.wallBeautify = wallBeautify;
    }

    @Override
    public void operation() {
        wallBeautify.operation();
        decoration();
    }

    /**
     * 装饰器实现类自定义实现方法
     * @author: R哥
     * @from: 公众号：Java技术栈
     */
    public abstract void decoration();

}
