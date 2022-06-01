import com.laq.mapper.StudentMapper;
import com.laq.model.Student;
import com.laq.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
        List<Student> studentList = studentMapper.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        studentList.get(2).setAge(3);
        studentMapper.update(studentList.get(2));

        studentList = studentMapper.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == 2) {
                studentMapper.delete(studentList.get(i));
            }
        }
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
//        studentService.testmethod();

        Student student = new Student(2L, "001-2020-1001-000002", "lyq", 15, "hf");
        studentService.add(student);

        List<Student> studentList = studentService.selectList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

}
