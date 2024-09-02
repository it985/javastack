package cn.javastack.test.designpattern.template;

/**
 * 模板方法模式-抽象支付类
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public abstract class AbstractPayment implements IPayment {

    /**
     * 支付方法（模板方法）
     * @param order
     * @return
     */
    @Override
    public PayResult pay(Order order) {
        // 校验支付参数
        checkPaymentData(order);

        // 风控检查
        checkRiskControl(order);

        // 准备支付渠道数据（子类实现）
        preparePaymentChannelData(order);

        // 调用支付渠道接口（子类实现）
        PayResult payResult = callPaymentChannel(order);

        // 校验支付结果（子类实现）
        checkPaymentResult(payResult);

        // 发送支付结果通知消息
        sendPaymentResultNotification(payResult);

        return payResult;
    }


    /**
     * 校验支付参数
     * @param order
     */
    protected final void checkPaymentData(Order order) {
        System.out.println("支付参数校验已通过！");
    }

    /**
     * 风控检查
     * @param order
     */
    protected final void checkRiskControl(Order order) {
        System.out.println("风控检查已通过！");
    }

    /**
     * 准备支付渠道数据（子类实现）
     * @param order
     */
    protected abstract void preparePaymentChannelData(Order order);

    /**
     * 调用支付渠道接口（子类实现）
     * @param order
     * @return PayResult
     */
    protected abstract PayResult callPaymentChannel(Order order);

    /**
     * 校验支付结果（子类实现）
     * @param payResult
     */
    protected abstract void checkPaymentResult(PayResult payResult);

    /**
     * 发送支付结果通知消息
     * @param payResult
     */
    protected final void sendPaymentResultNotification(PayResult payResult) {
        System.out.println("支付结果通知消息已发送！");
    }


}
