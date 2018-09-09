package com.caliven.dubbo.sb.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.caliven.dubbo.api.DemoService;

@Service/*(
        version = "${provider.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)*/
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello Dubbo, " + name + " (from Spring Boot)";
    }

}
