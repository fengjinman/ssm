import com.jinman.mapper.UserMapper;
import com.jinman.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserDao(){
        int id = 1;
        System.out.println(userMapper);
        User user = userMapper.findUserById(id);
        System.out.println("user = "+user);
    }
}
