package com.sixtofly.archetype.base.controller;

import com.sixtofly.archetype.base.config.apollo.ApolloProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xie yuan bing
 * @date 2022-03-27 12:51
 */
@RestController
@RequestMapping("/apollo")
public class ApolloController {

    @Autowired
    private ApolloProperty property;

    @RequestMapping("/getProperty")
    public ApolloProperty getProperty() {
        return property;
    }
}
