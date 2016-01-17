package cn.fengyu.mybatis.first;

import cn.fengyu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.core.helpers.UUIDUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/1/17.
 */
public class MyBaitsFirst {

    @Test
    public void findUserById() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserId", 1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void findUserByName() throws IOException {
         InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         SqlSession sqlSession = sessionFactory.openSession();
        List<User>list = sqlSession.selectList("test.findUserByName", "小");
        System.out.println(list);
        sqlSession.close();
    }
    @Test
    public void insertUser() throws IOException {
         InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();

        user.setUsername("风雨1");
        user.setAddress("福建福州");
        user.setBirthday(new Date());
        user.setSex("2");
        sqlSession.insert("test.insertUser", user);
        System.out.println("user.id=" + user.getId());
        sqlSession.close();
         UUID uuid = UUIDUtil.getTimeBasedUUID();

        System.out.println(uuid.toString().length());

    }

    @Test
    public void deleteUser() throws IOException {
         InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         SqlSession sqlSession = sessionFactory.openSession();
        sqlSession.delete("test.deleteUserById", 26);
        sqlSession.close();

    }

}
