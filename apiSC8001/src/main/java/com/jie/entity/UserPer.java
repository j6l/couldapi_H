package com.jie.entity;

import java.io.Serializable;
import lombok.Data;

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