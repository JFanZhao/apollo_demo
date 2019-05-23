package com.pagoda.apollo.demo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;

/**
 * @author: Ivan Chao
 * @date: 2019-05-22 10:02
 * @description: 普通使用方式
 **/
public class ApolloNormalApi {
    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "apollo.env";
        String someDefaultValue = "local";
        String value = config.getProperty(someKey, someDefaultValue);
        System.out.println(value);
    }
}

