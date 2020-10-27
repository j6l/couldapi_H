package com.jie.service;

import com.jie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/10/17
 * WWW https://github.com/j6l
 */
@Component
@FeignClient("consul-consumer")
public interface UserService {

    @GetMapping("/")
    User getone();

    @GetMapping("/get/{id}")
    User getoneBYid(@PathVariable("id")String id);

    @GetMapping("/getall")
    List<User> getall();
}
