package com.test.test;

import com.test.dao.IUsersDao;
import com.test.dao.impl.UserDao;

import java.security.PublicKey;

public class Tests {
    public static void main(String[] args) {

        IUsersDao myDao = new UserDao();
        myDao.getUsersById(2);
    }
}
