package junittest.mybatistest;

import com.decorate.ssm.mapper.UserListMapper;
import com.decorate.ssm.mapper.UserMapper;
import com.decorate.ssm.po.User;
import com.decorate.ssm.po.UserCustom;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * 使用注解方式进行junit的单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/WEB-INF/applicationContext.xml"})
public class MapperTest {

    /**
     * 注入mapper对象
     */
    @Autowired
    UserListMapper userListMapper;

    @Autowired
    SqlSession sqlSession;

    /**
     * 输入查询条件进行查询
     *
     * @throws Exception
     */
    @Test
    public void testUserListMapper() throws Exception {
        /*List<UserCustom> userList = userListMapper.findUserList(null);
        System.out.println(userList);*/
        //可以执行批量操作的sqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (int i = 0; i < 1000; i++) {
            String uuid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new User(null,uuid,"111",uuid+i,uuid+"@163.com"));
        }
    }


}
