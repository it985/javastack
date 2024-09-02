package cn.javastack.test.designpattern.template;

/**
 * 银联云闪付
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class UnionPay extends AbstractPayment {

    @Override
    protected void preparePaymentChannelData(Order order) {
        System.out.println("准备云闪付支付数据");
    }

    @Override
    protected PayResult callPaymentChannel(Order order) {
        System.out.println("调用云闪付支付接口");
        return null;
    }

    @Override
    protected void checkPaymentResult(PayResult payResult) {
        System.out.println("检查云闪付支付结果");
    }

}
