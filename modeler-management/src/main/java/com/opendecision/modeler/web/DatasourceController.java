package com.opendecision.modeler.web;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.service.DatasourceService;
import com.opendecision.modeler.web.request.DatasourcePageRequest;
import com.opendecision.modeler.web.request.DatasourceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/modeler")
public class DatasourceController {

    @Autowired
    private DatasourceService datasourceService;

    @PostMapping(value = "/datasourcePageList")
    public ResponseEntity datasourcePageList(@RequestBody DatasourcePageRequest datasourcePageRequest) {

        IPage<Datasource> page = new Page<>(datasourcePageRequest.getPage(), datasourcePageRequest.getSize());
        IPage<Datasource> datasourceList = datasourceService.findAll(page, datasourcePageRequest);
        return ResponseEntity
                .ok(datasourceList);
    }

    @PostMapping("/datasource")
    public ResponseEntity addDatasource(@RequestBody DatasourceRequest datasourceRequest) {

        datasourceService.createDatasource(datasourceRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/datasource/{id}")
    public ResponseEntity updateDatasource(@PathVariable String id, @RequestBody DatasourceRequest datasourceRequest) {


        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/datasource/{id}")
    public ResponseEntity deleteDatasource(@PathVariable String id) {

        datasourceService.deleteDatasource(id);
        return ResponseEntity.ok().build();
    }



}
