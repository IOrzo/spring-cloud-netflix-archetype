package com.sixtofly.archetype.base.config.apollo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author xie yuan bing
 * @date 2022-03-27 11:29
 */
@Data
public class ApolloProperty {

    @Value("${appName:default}")
    private String appName;

    @Value("${comment:基础服务，测试 Apollo 配置}")
    private String comment;

    @Value("${version:1}")
    private Integer version;
}
