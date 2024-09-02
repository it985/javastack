package cn.javastack.test.designpattern.decorator.concretedecorator;

import cn.javastack.test.designpattern.decorator.component.WallBeautify;
import cn.javastack.test.designpattern.decorator.decorator.WallBeautifyDecorator;

/**
 * 墙面装修装饰器角色实现（涂油漆）
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class WallBeautifyPaint extends WallBeautifyDecorator {

    public WallBeautifyPaint(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("开始涂油漆");
    }

}
