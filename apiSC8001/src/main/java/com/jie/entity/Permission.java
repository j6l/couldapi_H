package com.jie.entity;

import java.io.Serializable;
import lombok.Data;

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