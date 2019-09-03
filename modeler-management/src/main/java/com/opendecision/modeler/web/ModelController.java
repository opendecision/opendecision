package com.opendecision.modeler.web;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.opendecision.modeler.domain.Model;
import com.opendecision.modeler.service.ModelService;
import com.opendecision.modeler.web.request.ModelPageRequest;
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
    public ResponseEntity modelPageList(@RequestBody ModelPageRequest pageRequest) {

        IPage<Model> page = new Page<>(pageRequest.getPage(), pageRequest.getSize());
        IPage<Model> models = modelService.findAll(page, pageRequest);
        return ResponseEntity
                .ok(models);
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
