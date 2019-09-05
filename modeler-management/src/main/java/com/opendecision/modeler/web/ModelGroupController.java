package com.opendecision.modeler.web;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.opendecision.core.ResponseBuilder;
import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.service.ModelGroupService;
import com.opendecision.modeler.web.request.ModelGroupPageRequest;
import com.opendecision.modeler.web.request.ModelGroupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/modeler")
public class ModelGroupController {

    @Autowired
    private ModelGroupService modelGroupService;

    @PostMapping(value = "/modelGroups")
    public ResponseBuilder modelGroupPageList(@RequestBody ModelGroupPageRequest pageRequest) {

        IPage<ModelGroup> page = new Page<>(pageRequest.getPage(), pageRequest.getSize());
        IPage<ModelGroup> modelGroups = modelGroupService.findAll(page, pageRequest);
        return ResponseBuilder.ok().data(modelGroups);

    }

    @PostMapping("/modelGroup")
    public ResponseEntity addModelGroup(@RequestBody ModelGroupRequest groupRequest) {

        modelGroupService.addModelGroup(groupRequest);

        return ResponseEntity
                .ok()
                .build();
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
