package cn.javastack.test.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回结果
 * 公众号：Java技术栈
 */
@Data
@AllArgsConstructor
public class PayResult {

    /**
     * 支付结果
     */
    private String result;

}
