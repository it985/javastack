package cn.javastack.test.designpattern.factory.method;

import cn.javastack.test.designpattern.factory.simple.BankPartner;
import cn.javastack.test.designpattern.factory.simple.Customer;
import cn.javastack.test.designpattern.factory.simple.Merchant;

/**
 * 银行客户工厂
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class BankPartnerFactory implements CustomerFactory {

    @Override
    public Customer create(String type, String name) {
        return new BankPartner(type, name);
    }

}
