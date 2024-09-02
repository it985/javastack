package cn.javastack.test.designpattern.template;

/**
 * 支付接口
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public interface IPayment {

    /**
     * 支付
     * @param order
     * @return
     */
    PayResult pay(Order order);

}
