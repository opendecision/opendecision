package com.opendecision.modeler.web;


import com.opendecision.modeler.service.ModelGroupService;
import com.opendecision.modeler.web.request.ModelGroupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelGroupController {

    @Autowired
    private ModelGroupService modelGroupService;

    @PostMapping(value = "/modelGroups")
    public ResponseEntity modelGroupPageList(@RequestBody ModelGroupRequest groupRequest) {

//        PageInfo<ModelGroup> modelGroups = null;

        return null;
    }

    @PostMapping("/modelGroup")
    public ResponseEntity addModelGroup(@RequestBody ModelGroupRequest groupRequest) {

        modelGroupService.addModelGroup(groupRequest);

        return ResponseEntity.ok().build();
    }


    @PostMapping("/modelGroup/{id}")
    public ResponseEntity updateModelGroup(@PathVariable String id, @RequestBody ModelGroupRequest groupRequest) {

        modelGroupService.updateModelGroup(id, groupRequest);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/modelGroup/{id}")
    public ResponseEntity deleteModelGroup(@PathVariable String id) {

        modelGroupService.deleteModelGroup(id);

        return ResponseEntity.ok().build();
    }
}
