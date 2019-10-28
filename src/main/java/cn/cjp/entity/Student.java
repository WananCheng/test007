package cn.cjp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain =true)
public class Student  implements Serializable {

    private Integer id;
    private Integer student_id;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;
}
