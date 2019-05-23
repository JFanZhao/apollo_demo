package com.pagoda.apollo.demo.controller;

import com.pagoda.apollo.demo.bean.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Ivan Chao
 * @date: 2019-05-22 17:20
 * @description: 控制类
 **/
@RestController
public class ApolloApiController {
    @Value("${timeout:ins}")  //默认值test 读不到的情况下 就是insØØ
    private String timeout;

    @Resource
    private TestJavaConfigBean testJavaConfigBean;

    @RequestMapping("/getName")
    public String getName() {

        StringBuilder sb = new StringBuilder();
        sb.append("timeout =" + testJavaConfigBean.getTimeout() + ",batch = " + testJavaConfigBean.getBatch());

        return sb.toString();
    }

    @RequestMapping("/getTimeout")
    public String getTimeout() {
        return timeout;
    }

}
