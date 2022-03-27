package com.sixtofly.archetype.base.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用 apollo 配置中心来获取配置信息
 * @author xie yuan bing
 * @date 2022-03-27 13:16
 */
@Configuration
@EnableApolloConfig
public class ApolloPropertyConfig {

    @Bean
    public ApolloProperty apolloProperty() {
        return new ApolloProperty();
    }
}
