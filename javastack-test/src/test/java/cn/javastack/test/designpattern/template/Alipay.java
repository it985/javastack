package cn.javastack.test.designpattern.template;

/**
 * 支付宝
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class Alipay extends AbstractPayment {


    @Override
    protected void preparePaymentChannelData(Order order) {
        System.out.println("准备支付宝支付数据");
    }

    @Override
    protected PayResult callPaymentChannel(Order order) {
        System.out.println("调用支付宝支付接口");
        return null;
    }

    @Override
    protected void checkPaymentResult(PayResult payResult) {
        System.out.println("检查支付宝支付结果");
    }

}
