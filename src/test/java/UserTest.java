import cn.cjp.dao.UserDao;
import cn.cjp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Autowired
    private UserDao userDao;



    @Test
    public void getUser(){
        User user = userDao.selectUserByName("cjp");
        String username  = user.getUsername();
        String password =  user.getPassword();
        System.out.println(username);
        System.out.println(password);
    }
}
