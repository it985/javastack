package cn.javastack.test.designpattern.decorator.concretecomponent;

import cn.javastack.test.designpattern.decorator.component.WallBeautify;

/**
 * 墙面装修基本实现（清理墙面）
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class WallBeautifyClean implements WallBeautify {

    @Override
    public void operation() {
        System.out.println("开始清理墙面");
    }

}
