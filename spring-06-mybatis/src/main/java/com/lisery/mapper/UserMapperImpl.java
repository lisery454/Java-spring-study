package com.lisery.mapper;

import com.lisery.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    public void addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.addUser(user);
    }

    public void deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.deleteUser(id);
    }
}
