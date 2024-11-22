package cn.javastack.test.designpattern.adapter;


/**
 * 银联云闪付
 * 公众号：Java技术栈
 */
public class UnionPayAdapter implements IPayment {

    private UnionPayAPI unionPayAPI = new UnionPayAPI();

    @Override
    public PayResult pay(Order order) {
        return unionPayAPI.pay(order);
    }

}
