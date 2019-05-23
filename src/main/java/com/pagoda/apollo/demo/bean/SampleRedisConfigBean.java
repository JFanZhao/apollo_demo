package com.pagoda.apollo.demo.bean;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Ivan Chao
 * @date: 2019-05-22 18:10
 * @description:
 **/
@EnableApolloConfig
@ConfigurationProperties(prefix = "redis.cache")
public class SampleRedisConfigBean {
    private int expireSeconds;
    private int commandTimeout;

    public void setExpireSeconds(int expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }

    public int getExpireSeconds() {
        return expireSeconds;
    }

    public int getCommandTimeout() {
        return commandTimeout;
    }
}
