import com.jinman.dao.UserDao;
import com.jinman.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testUserDao(){
        int id = 1;
        System.out.println(userDao);
        User user = userDao.findUserById(id);
        System.out.println("user = "+user);
    }
}
