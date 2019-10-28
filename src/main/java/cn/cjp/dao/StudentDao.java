package cn.cjp.dao;

import cn.cjp.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    int getTotal();

    void addStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    Student getStudent(int id);

    List<Student>  list(int start,int count);
}
