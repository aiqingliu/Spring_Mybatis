package com.laq.service.impl;

import com.laq.mapper.StudentMapper;
import com.laq.model.Student;
import com.laq.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public List<Student> selectList() {
        List<Student> studentList = studentMapper.selectList();
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }

    @Override
    public void delete(Student student) {
        studentMapper.delete(student);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void testmethod() {
        List<Student> studentList = studentMapper.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        studentList.get(2).setAge(18);
        studentMapper.update(studentList.get(2));

        studentList = studentMapper.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        studentMapper.delete(studentList.get(1));

        studentList = studentMapper.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
