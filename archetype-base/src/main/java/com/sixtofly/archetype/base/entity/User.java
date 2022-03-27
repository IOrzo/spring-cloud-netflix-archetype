package com.sixtofly.archetype.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xie yuan bing
 * @date 2022-03-27 11:01
 */
@Data
@AllArgsConstructor
public class User {

    private String username;

    private Integer age;
}
