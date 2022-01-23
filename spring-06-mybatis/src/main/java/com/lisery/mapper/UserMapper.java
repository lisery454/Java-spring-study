package com.lisery.mapper;

import com.lisery.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    public void addUser(User user);

    public void deleteUser(int id);
}
