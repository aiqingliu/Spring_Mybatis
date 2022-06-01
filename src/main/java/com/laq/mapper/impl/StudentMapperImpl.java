package com.laq.mapper.impl;

import com.laq.mapper.StudentMapper;
import com.laq.model.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentMapperImpl implements StudentMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Student> selectList() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.selectList();
        return studentList;
    }

    @Override
    public void add(Student student) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.add(student);
    }

    @Override
    public void delete(Student student) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.delete(student);
    }

    @Override
    public void update(Student student) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.update(student);
    }
}
