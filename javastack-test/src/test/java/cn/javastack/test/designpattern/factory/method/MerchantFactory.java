package cn.javastack.test.designpattern.factory.method;

import cn.javastack.test.designpattern.factory.simple.Customer;
import cn.javastack.test.designpattern.factory.simple.Merchant;

/**
 * 商户工厂
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
public class MerchantFactory implements CustomerFactory {

    @Override
    public Customer create(String type, String name) {
        return new Merchant(type, name);
    }

}
