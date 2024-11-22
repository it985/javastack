package cn.javastack.test.designpattern.adapter;

import org.junit.jupiter.api.Test;

/**
 * 客户端调用
 */
public class Client {

    @Test
    public void testWechatPay() {
        IPayment wechatPay = new WechatPayAdapter();
        PayResult payResult = wechatPay.pay(new Order(31, "wechatPay"));
        System.out.println(payResult.getResult());
    }

    @Test
    public void testAlipayPay() {
        IPayment alipay = new AlipayAdapter();
        PayResult payResult = alipay.pay(new Order(56, "alipay"));
        System.out.println(payResult.getResult());
    }

    @Test
    public void testUnionPay() {
        IPayment unionPay = new UnionPayAdapter();
        PayResult payResult = unionPay.pay(new Order(68, "unionPay"));
        System.out.println(payResult.getResult());
    }

}
