package com.kxg.dubbo_learningProvider.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.kxg.dubbo_learningApi.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String hello) {
         return "Hello, " + hello + ", " + new Date();
    }
}
