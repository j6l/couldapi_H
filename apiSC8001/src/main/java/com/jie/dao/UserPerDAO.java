package com.jie.dao;

import com.jie.entity.UserPer;
import com.jie.entity.UserPerExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserPerDAO继承基类
 */
@Mapper
@Repository
public interface UserPerDAO extends MyBatisBaseDao<UserPer, Integer, UserPerExample> {
}