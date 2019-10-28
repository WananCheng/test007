import cn.cjp.dao.UsersDao;
import cn.cjp.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    public void test1(){
        Users users = usersDao.selectUsersByName("hmlcjp");
        System.out.println(users.getUsername());
        System.out.println(users.getPassword());
        System.out.println(users.getSalt());
    }
}
