package cn.fengyu.mybatis.dao;

import cn.fengyu.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by Administrator on 2016/1/17.
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public User findUserById(int id) throws Exception {
         SqlSession sqlSession = sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserId", id);


        sqlSession.close();
        return user;
    }
    public void InsertUser(User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

         sqlSession.insert("test.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
    }
    public void deleteUser(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteUserById", 1);
        sqlSession.commit();
        sqlSession.close();

    }
}
