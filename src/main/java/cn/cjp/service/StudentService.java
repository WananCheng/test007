package cn.cjp.service;

import cn.cjp.entity.Student;

import java.util.List;

public interface StudentService {

    int getTotle();

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    Student getStudent(int id);

    List<Student> list(int start,int count);
}
