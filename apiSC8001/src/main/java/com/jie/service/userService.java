package com.jie.service;

import com.jie.dao.UserDAO;
import com.jie.entity.User;
import com.jie.entity.UserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@Slf4j
@Service
public class userService {

    @Autowired
    private UserDAO userDAO;

    @Cacheable(value = "getOne", key = "methodName")
    public User getOne() {
        log.info( " one  调用service   1651561161" );
        User user = userDAO.selectByPrimaryKey( String.valueOf( 1651561161 ) );
        return user;
    }

    @Cacheable(value ="getOne",key = "#id")
    public User getoneBYid(String id){
        log.info( "调用service"+id );
        User user = userDAO.selectByPrimaryKey( id );
        return user;
    }


    @Cacheable(value = "getOne",key = "methodName")
    public List<User> getAll() {
        return this.getAllq();
    }


    public List<User> getAllq() {
        log.info( " getAll  调用service   users123" );
        UserExample example = new UserExample();
        example.createCriteria().andIdIsNotNull();
        List<User> users = userDAO.selectByExample( example );
        return users;
    }
}
