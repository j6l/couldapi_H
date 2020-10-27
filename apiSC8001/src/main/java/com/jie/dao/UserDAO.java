package com.jie.dao;

import com.jie.entity.User;
import com.jie.entity.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Mapper
@Repository
public interface UserDAO extends MyBatisBaseDao<User, String, UserExample> {
}