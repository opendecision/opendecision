package com.opendecision.modeler.web;


import com.opendecision.modeler.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping(value = "/models")
    public ResponseEntity modelPageList() {



        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/model/{id}")
    public ResponseEntity deleteModel(@PathVariable String id) {

        return ResponseEntity.ok().build();
    }

    @PostMapping("/model")
    public ResponseEntity addModel() {

        return ResponseEntity.ok().build();
    }




}
