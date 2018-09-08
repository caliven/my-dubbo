package com.caliven.dubbo.sb.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.caliven.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(
            version = "${consumer.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:28080"
    )
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}
