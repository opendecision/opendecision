package com.opendecision.modeler.service;

import com.opendecision.modeler.domain.Datasource;

public interface DatasourceService {

    void createDatasource(Datasource datasource);

    void deleteDatasource(String id);

    void updateDatasource(Datasource datasource);

    void findOne(String id);

    void queryDatasources();
}
