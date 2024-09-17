package cn.javastack.test.designpattern.template;

/**
 * 微信支付
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class WechatPay extends AbstractPayment {

    @Override
    protected void preparePaymentChannelData(Order order) {
        System.out.println("准备微信支付数据");
    }

    @Override
    protected PayResult callPaymentChannel(Order order) {
        System.out.println("调用微信支付接口");
        return null;
    }

    @Override
    protected void checkPaymentResult(PayResult payResult) {
        System.out.println("检查微信支付结果");
    }

}
