package com.caliven.dubbo.provider;

import com.caliven.dubbo.api.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.out.println("=========>>> name=" + name);
        return name+"（我是提供者加入的文字）";
    }

}
