package cn.fengyu.mybatis.mapper;

import cn.fengyu.mybatis.pojo.User;

/**
 * Created by Administrator on 2016/1/17.
 */
public interface UserMapper {

    public User findUserId(int id) throws Exception;
}
