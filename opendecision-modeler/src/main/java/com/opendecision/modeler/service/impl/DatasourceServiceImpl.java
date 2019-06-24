package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Dataset;
import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.mapper.DatasourceMapper;
import com.opendecision.modeler.service.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasourceServiceImpl implements DatasourceService {

    @Autowired
    private DatasourceMapper datasourceMapper;

    private Datasource getById(String id) {
        return datasourceMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return datasourceMapper.deleteByPrimaryKey(id);
    }

    private int updateById(Datasource datasource) {
        return datasourceMapper.updateByPrimaryKey(datasource);
    }

    private int insert(Datasource datasource) {
        return datasourceMapper.insert(datasource);
    }



}
