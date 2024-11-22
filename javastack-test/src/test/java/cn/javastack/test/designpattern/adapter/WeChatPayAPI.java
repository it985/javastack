package cn.javastack.test.designpattern.adapter;

/**
 * 微信支付 API
 * 公众号：Java技术栈
 */
public class WeChatPayAPI {

    public PayResult pay(Order order) {
        return new PayResult("微信支付成功：" + order);
    }

}
