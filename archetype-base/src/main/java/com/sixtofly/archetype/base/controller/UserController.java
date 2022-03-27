package com.sixtofly.archetype.base.controller;

import com.sixtofly.archetype.base.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xie yuan bing
 * @date 2022-03-27 11:00
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUser")
    public User getUser() {
        return new User("xx", 18);
    }
}
