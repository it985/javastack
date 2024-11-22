package cn.javastack.test.designpattern.adapter;


/**
 * 支付接口
 * 公众号：Java技术栈
 */
public interface IPayment {

    PayResult pay(Order order);

}
