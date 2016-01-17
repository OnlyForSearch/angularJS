package cn.fengyu.mybatis.dao;

import cn.fengyu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by Administrator on 2016/1/17.
 */
public class UserDaoImplTest {
    private  SqlSessionFactory  sqlSessionFactory;
    @Before
    public  void  setUp()throws Exception {
         InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testFindUserById() throws Exception {

        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
         User user = userDao.findUserById(1);
        System.out.println(user);
    }
    @Test
    public void testInsertUser() throws Exception {

    }
    @Test
    public void testDeleteUser() throws Exception {

    }
}