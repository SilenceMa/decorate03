package junittest.controllertest;

import com.decorate.ssm.po.UserCustom;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/WEB-INF/applicationContext.xml","classpath:/WEB-INF/dispatcher-servlet.xml"})
public class UserControllerTest {
    //传入stringMVC的IOC
    @Autowired
    WebApplicationContext context;
    /**
     * 虚拟的mvc请求获取到处理结果
     */
    MockMvc mockMvc;
    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    /**
     * 测试分页的方法
     */
    @Test
    public void testPage() throws Exception{
        /**
         * 进行页面请求的模拟
         */
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/main/users").
                param("page","1")).andReturn();
        /**
         * 请求以后，请求域中会有pageInfo，我们可以去除pageInfo中的数据进行验证
         */
        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码"+pageInfo.getPageNum());
        System.out.println("总页码"+pageInfo.getPages());
        System.out.println("总记录数"+pageInfo.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int []nums = pageInfo.getNavigatepageNums();
        for (int i: nums
             ) {
            System.out.println(" " +i);
        }

        //获取员工数据
        List<UserCustom> userCustomList = pageInfo.getList();
        for (UserCustom user: userCustomList
             ) {
            System.out.println("当前员工的id为"+user.getId()+"    姓名："+user.getUserName());
        }
    }
}
