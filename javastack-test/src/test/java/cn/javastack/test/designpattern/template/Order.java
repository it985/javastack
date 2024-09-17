package cn.javastack.test.designpattern.template;

import lombok.Data;

/**
 * 订单信息
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Data
public class Order {

    /**
     * 金额
     */
    private int amount;

    /**
     * 支付类型
     */
    private String paymentType;

}
