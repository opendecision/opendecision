package com.opendecision.decision.web;

import com.opendecision.decision.domain.ExampleModelRequest;
import com.opendecision.decision.service.ModelPMMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ModelPMMLService pmmlService;

    @RequestMapping(value = "/decision/iris")
    public void iris(@RequestBody ExampleModelRequest exampleRequest) {

    }

    @RequestMapping(value = "/decision/adult")
    public void adult(@RequestBody ExampleModelRequest exampleRequest) {

    }


}
