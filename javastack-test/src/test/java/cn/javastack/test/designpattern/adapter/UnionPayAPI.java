package cn.javastack.test.designpattern.adapter;

/**
 * 银联支付 API
 * 公众号：Java技术栈
 */
public class UnionPayAPI {
    
    public PayResult pay(Order order) {
        return new PayResult("云闪付支付成功：" + order);
    }

}
