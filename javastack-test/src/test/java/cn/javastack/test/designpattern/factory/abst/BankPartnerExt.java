package cn.javastack.test.designpattern.factory.abst;

import lombok.Data;
import lombok.ToString;

/**
 * 银行客户扩展
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Data
@ToString(callSuper = true)
public class BankPartnerExt extends CustomerExt {

    /**
     * 分行个数
     */
    private int branchCount;

    /**
     * ATM个数
     */
    private int atmCount;

}
