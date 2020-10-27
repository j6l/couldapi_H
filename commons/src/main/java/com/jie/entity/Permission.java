package com.jie.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
public class Permission implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}