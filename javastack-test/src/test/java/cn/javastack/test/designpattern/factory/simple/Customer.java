package cn.javastack.test.designpattern.factory.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Customer {

    /**
     * 客户名称
     */
    private String name;

    /**
     * 客户类型
     */
    private String type;

}
