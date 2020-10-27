package com.jie.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
public class UserPer implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer pid;

    private static final long serialVersionUID = 1L;
}