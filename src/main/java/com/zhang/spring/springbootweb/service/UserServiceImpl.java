package com.zhang.spring.springbootweb.service;

import com.zhang.spring.springbootweb.mapper.UserMapper;
import com.zhang.spring.springbootweb.vo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    public SqlSessionTemplate sqlSessionTemplate;

    public String namespace = UserMapper.class.getName() + ".";

    @Override
    public int insertUser(User user) {

        return sqlSessionTemplate.insert(namespace + "insertUser",user);
    }
}
