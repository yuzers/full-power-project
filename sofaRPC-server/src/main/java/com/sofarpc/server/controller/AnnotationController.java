package com.sofarpc.server.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.sofarpc.server.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("rpc/call")
@RestController
public class AnnotationController {

    @Autowired
    private AnnotationService annotationService;

    @RequestMapping("annotate")
    public String Annotate(){
        return annotationService.message();
    }

}
