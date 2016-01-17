package cn.fengyu.mybatis.dao;

import cn.fengyu.mybatis.pojo.User;

/**
 * Created by Administrator on 2016/1/17.
 */
public interface UserDao {

    public User findUserById(int id)throws Exception;

    public void InsertUser(User user)throws Exception;

    public void deleteUser(int id)throws Exception;

}
