package com.caliven.dubbo.sb.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.caliven.dubbo.api.DemoService;

@Service(
        version = "1.0",
        application = "${dubbo.application.name}",
        registry = "${dubbo.registry}",
        protocol = ""
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return null;
    }

}
