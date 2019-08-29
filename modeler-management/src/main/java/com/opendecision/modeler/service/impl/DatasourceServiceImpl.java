package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.mapper.DatasourceMapper;
import com.opendecision.modeler.service.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasourceServiceImpl implements DatasourceService {

    @Autowired
    private DatasourceMapper datasourceMapper;

    @Override
    public void createDatasource(Datasource datasource) {

    }

    @Override
    public void deleteDatasource(String id) {

    }

    @Override
    public void updateDatasource(Datasource datasource) {

    }

    @Override
    public void findOne(String id) {

    }

    @Override
    public void queryDatasources() {

    }
}
