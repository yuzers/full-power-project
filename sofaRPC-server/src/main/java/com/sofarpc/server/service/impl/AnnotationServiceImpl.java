package com.sofarpc.server.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.sofarpc.server.service.AnnotationService;
import org.springframework.stereotype.Component;

//发送服务
@SofaService(interfaceType = AnnotationService.class,
        bindings = {@SofaServiceBinding(bindingType = "bolt")})
@Component
public class AnnotationServiceImpl implements AnnotationService {

    @Override
    public String message() {
        System.out.println("服务被调用了");
        return "hello sofaRpc";
    }
}
