package com.jie;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@SpringBootApplication
@EnableFeignClients
@EnableApolloConfig
public class openFeig80 {

    public static void main(String[] args) {
        SpringApplication.run( openFeig80.class,args );
    }
}
