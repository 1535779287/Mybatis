package com.test.dao.impl;

import com.test.dao.IUsersDao;
import com.test.entity.Users;
import org.apache.ibatis.session.SqlSession;
import org.springframework.test.context.jdbc.Sql;
import utils.MybatisUtil;

import java.util.List;

public class UserDao implements IUsersDao{


    @Override
    public boolean addUser(Users users) {
        SqlSession session = MybatisUtil.getSqlSession();
        session.getMapper(IUsersDao.class).addUser(users);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteUser(Integer uId) {
        SqlSession session = MybatisUtil.getSqlSession();
        session.getMapper(IUsersDao.class).deleteUser(uId);
        return false;
    }

    @Override
    public Users getUsersById(Integer uId) {
        //获取session
        SqlSession session = MybatisUtil.getSqlSession();
        //获取映射的接口
        //接收的参数是单行时
        Users user = session.getMapper(IUsersDao.class).getUsersById(uId);
        //关闭session
        System.out.println("用户名字："+user.getuName()+"，用户性别"+user.getuSex()+"，用户ID"+user.getUid());
        session.close();
        return user;
    }

    @Override
    public Boolean upDataUser(Users users) {
        return null;
    }

    @Override
    public List getUserList() {
        SqlSession session = MybatisUtil.getSqlSession();
        session.getMapper(IUsersDao.class).getUserList();
        return null;
    }
}
