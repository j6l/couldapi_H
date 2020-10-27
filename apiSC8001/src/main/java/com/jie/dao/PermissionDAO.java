package com.jie.dao;

import com.jie.entity.Permission;
import com.jie.entity.PermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PermissionDAO继承基类
 */
@Mapper
@Repository
public interface PermissionDAO extends MyBatisBaseDao<Permission, Long, PermissionExample> {
}