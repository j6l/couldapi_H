package com.jie.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
@Data
public class User implements Serializable {
    /**
     * uuid
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户权限
     */
    private String role;

    /**
     * 创建时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;
}