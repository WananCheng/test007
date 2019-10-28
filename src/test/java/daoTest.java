import cn.cjp.dao.StudentDao;
import cn.cjp.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class daoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void getTotal(){
        int a = studentDao.getTotal();
        System.out.println(a);
    }

    @Test
    public void getLimit(){
       List<Student> slist =  studentDao.list(0,10);
        System.out.println(slist);
    }
}
