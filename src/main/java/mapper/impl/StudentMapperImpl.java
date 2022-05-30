package mapper.impl;

import mapper.StudentMapper;
import model.Student;
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
}