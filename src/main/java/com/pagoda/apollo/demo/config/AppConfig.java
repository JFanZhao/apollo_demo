package com.pagoda.apollo.demo.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.pagoda.apollo.demo.bean.SampleRedisConfigBean;
import com.pagoda.apollo.demo.bean.TestJavaConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Ivan Chao
 * @date: 2019-05-22 17:56
 * @description: config manager
 **/
@Configuration
@EnableApolloConfig
public class AppConfig {
    @Bean
    public TestJavaConfigBean javaConfigBean() {
        return new TestJavaConfigBean();
    }

    @Bean
    public SampleRedisConfigBean sampleRedisConfig() {
        return new SampleRedisConfigBean();
    }
}
