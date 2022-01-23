package com.lisery.service;

import com.lisery.dao.UserDao;
import com.lisery.dao.UserDaoImpl;
import com.lisery.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao = null;

    public void getUser() {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
