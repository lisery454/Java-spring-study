package com.lisery.service;

import com.lisery.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
