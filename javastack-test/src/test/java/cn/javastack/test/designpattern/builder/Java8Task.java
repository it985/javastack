package cn.javastack.test.designpattern.builder;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Data
public class Java8Task {

    private long id;
    private String name;
    private String content;
    private int type;
    private int status;
    private Date finishDate;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", finishDate=" + finishDate +
                '}';
    }

}
