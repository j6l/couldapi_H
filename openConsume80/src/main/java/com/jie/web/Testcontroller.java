package com.jie.web;

import com.jie.entity.User;
import com.jie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@Slf4j
@RestController
@RefreshScope
public class Testcontroller {

    @Autowired
    UserService userService;

    @Value( "${jie-kinf}" )
    String jie;


    @GetMapping("/")
    public User getone() {
        log.info( "80  getone" );
        return userService.getone();
    }

    @GetMapping("/get/{id}")
    public User getoneBYid(@PathVariable("id")String id) {
        log.info( "80  getone"+id );
        return userService.getoneBYid( id );
    }

    @GetMapping("/getall")
    public List<User> getall() {
        log.info( "80  getall" );
        return userService.getall();
    }

    @GetMapping("/a")
    public String geta(){
        log.debug( "debug" );
        return jie;
    }
}
