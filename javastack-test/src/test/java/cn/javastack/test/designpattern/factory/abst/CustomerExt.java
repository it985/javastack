package cn.javastack.test.designpattern.factory.abst;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户扩展
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Data
@NoArgsConstructor
public abstract class CustomerExt {

    /**
     * 客户曾用名
     */
    private String formerName;

    /**
     * 客户扩展说明
     */
    private String note;

}
