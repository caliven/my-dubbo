package com.caliven.dubbo.provider;

import com.caliven.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.out.println("=========>>> name=" + name);
        return name+"（我是提供者加入的文字）";
    }

}
