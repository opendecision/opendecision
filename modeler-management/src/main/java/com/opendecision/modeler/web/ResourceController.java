package com.opendecision.modeler.web;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.opendecision.core.ResponseBuilder;
import com.opendecision.modeler.domain.Resource;
import com.opendecision.modeler.service.ResourceService;
import com.opendecision.modeler.web.request.ResourcePageRequest;
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
    public ResponseBuilder<Resource> resourcePageList(@RequestBody ResourcePageRequest pageRequest) {

        IPage<Resource> page = new Page<>(pageRequest.getPage(), pageRequest.getSize());
        IPage<Resource> resourceList = resourceService.findAll(page, pageRequest);
        return ResponseBuilder.ok().data(resourceList);
    }

    @PostMapping("/resource")
    public ResponseEntity createResource(@RequestBody ResourceRequest resourceRequest) {

        resourceService.saveResource(resourceRequest.buildResource());
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
