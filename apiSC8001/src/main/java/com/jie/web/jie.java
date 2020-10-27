package com.jie.web;

import com.jie.entity.User;
import com.jie.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class jie {

    @Autowired
    private userService userService;


    @GetMapping("/")
    public User getone(){
        log.info( "8001  getone" );
        return userService.getOne();
    }

    @GetMapping("/get/{id}")
    public User getoneBYid(@PathVariable("id")String id){
        log.info( "8001  getone"+id );
        return userService.getoneBYid(id);
    }

    @GetMapping("/getall")
    public List<User> getall(){
        log.info( "8001  getall" );
        return userService.getAll();
    }
}
