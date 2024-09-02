package cn.javastack.test.designpattern.template;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 支付服务
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@SpringBootTest
public class PaymentTest {

    @Test
    public void tesWechatPay() {
        Order order = new Order();
        order.setAmount(89);
        order.setPaymentType("wx");

        // 微信支付
        IPayment wechatPay = new WechatPay();
        wechatPay.pay(order);
    }

    @Test
    public void tesAlipay() {
        Order order = new Order();
        order.setAmount(89);
        order.setPaymentType("alipay");

        // 支付宝支付
        IPayment alipay = new Alipay();
        alipay.pay(order);
    }

}
