package cn.javastack.test.designpattern.adapter;

/**
 * 微信支付
 * 公众号：Java技术栈
 */
public class WechatPayAdapter implements IPayment {

    private WeChatPayAPI weChatPayAPI = new WeChatPayAPI();

    @Override
    public PayResult pay(Order order) {
        return weChatPayAPI.pay(order);
    }

}
