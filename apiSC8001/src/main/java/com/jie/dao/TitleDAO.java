package com.jie.dao;

import com.jie.entity.Title;
import com.jie.entity.TitleExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TitleDAO继承基类
 */
@Mapper
@Repository
public interface TitleDAO extends MyBatisBaseDao<Title, String, TitleExample> {
}