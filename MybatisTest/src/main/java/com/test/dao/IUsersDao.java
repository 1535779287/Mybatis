package com.test.dao;

import com.test.entity.Users;

import java.util.List;

/**
 *实现User持久化的Dao的接口
 */
public interface IUsersDao {
    public boolean addUser(Users users);
    public boolean deleteUser(Integer uId);
    public Users getUsersById(Integer uId);
    public Boolean upDataUser(Users users);
    public List getUserList();

 }
