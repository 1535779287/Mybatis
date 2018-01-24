package com.mybatis;

import com.test.dao.IUsersDao;
import com.test.dao.impl.UserDao;
import junit.framework.TestCase;
import org.junit.Test;

public class test extends TestCase{
    private IUsersDao myDao = new UserDao();
    @Test
    public void test(){
        myDao.getUsersById(2);
    }
}
