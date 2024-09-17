package cn.javastack.test.designpattern.builder;

import lombok.Builder;

import java.util.Date;

/**
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Builder
public class LombokTask {

    private long id;
    private String name;
    private String content;
    private int type;
    private int status;
    private Date finishDate;


}
