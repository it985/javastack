package cn.javastack.test.designpattern.adapter;

/**
 * 支付宝支付 API
 * 公众号：Java技术栈
 */
public class AlipayAPI {

    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功：" + order);
    }

}
