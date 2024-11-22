package cn.javastack.test.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 订单信息
 * 公众号：Java技术栈
 */
@Data
@AllArgsConstructor
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
