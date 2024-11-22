package cn.javastack.test.designpattern.adapter;

/**
 * 支付宝
 * 公众号：Java技术栈
 */
public class AlipayAdapter implements IPayment {

    private AlipayAPI alipayAPI = new AlipayAPI();

    @Override
    public PayResult pay(Order order) {
        return alipayAPI.pay(order);
    }

}
