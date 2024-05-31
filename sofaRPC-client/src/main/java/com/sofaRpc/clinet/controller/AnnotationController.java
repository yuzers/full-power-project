package com.sofaRpc.clinet.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.sofarpc.server.service.AnnotationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("rpc/call")
@RestController
public class AnnotationController {

    @SofaReference(interfaceType = AnnotationService.class,
            binding = @SofaReferenceBinding(bindingType = "bolt"))
    private AnnotationService annotationService;

    @RequestMapping("annotate")
    public String Annotate(){
        System.out.println("调用服务");
        return annotationService.message();
    }

}
