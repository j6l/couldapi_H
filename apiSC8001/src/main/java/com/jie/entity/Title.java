package com.jie.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Title implements Serializable {
    private String uid;

    private String title;

    private String nrong;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date utime;

    private static final long serialVersionUID = 1L;
}