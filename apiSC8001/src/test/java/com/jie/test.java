package com.jie;

import com.jie.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@SpringBootTest
public class test {

    @Autowired
    private com.jie.service.userService userService;

    @Test
    void getall(){
        List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println( user.toString() );
        }
    }
    @Test
    void getone1(){
        User all = userService.getOne();

            System.out.println( all.toString() );
    }
}
