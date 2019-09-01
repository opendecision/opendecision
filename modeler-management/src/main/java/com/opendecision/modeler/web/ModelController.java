package com.opendecision.modeler.web;


import com.opendecision.modeler.service.ModelService;
import com.opendecision.modeler.web.request.ModelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/modeler")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping(value = "/models")
    public ResponseEntity modelPageList() {



        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/model/{id}")
    public ResponseEntity deleteModel(@PathVariable String id) {

        modelService.deleteModelById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/model")
    public ResponseEntity addModel(@RequestBody ModelRequest modelRequest) {

        return ResponseEntity.ok().build();
    }




}
