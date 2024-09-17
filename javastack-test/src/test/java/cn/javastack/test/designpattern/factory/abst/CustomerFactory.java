package cn.javastack.test.designpattern.factory.abst;

import cn.javastack.test.designpattern.factory.simple.Customer;

/**
 * 抽象工厂客户接口
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public interface CustomerFactory {

    Customer createCustomer(String type, String name);

    CustomerExt createCustomerExt();

}
