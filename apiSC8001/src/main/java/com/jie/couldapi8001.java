package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@SpringBootApplication
@EnableCaching
public class couldapi8001 {

    public static void main(String[] args) {

        SpringApplication.run( couldapi8001.class,args );
    }
}
