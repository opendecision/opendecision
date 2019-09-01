package com.opendecision.modeler.web;

import com.opendecision.modeler.service.ResourceService;
import com.opendecision.modeler.web.request.ResourceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/modeler")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @PostMapping(value = "/resources")
    public ResponseEntity resourcePageList(@RequestBody ResourceRequest resourceRequest) {

//        PageInfo<ModelGroup> modelGroups = null;

        return null;
    }

    @PostMapping("/resource")
    public ResponseEntity createResource(@RequestBody ResourceRequest resourceRequest) {


        return ResponseEntity.ok().build();
    }


    @PostMapping("/resource/{id}")
    public ResponseEntity updateResource(@PathVariable String id, @RequestBody ResourceRequest resourceRequest) {

        resourceService.updateResource(id, resourceRequest);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/resource/{id}")
    public ResponseEntity deleteResource(@PathVariable String id) {

        resourceService.deleteResource(id);

        return ResponseEntity.ok().build();
    }
}
