package com.opendecision.modeler.service;

import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.web.request.DatasourceRequest;

public interface DatasourceService {

    void createDatasource(DatasourceRequest datasourceRequest);

    void deleteDatasource(String id);

    void updateDatasource(Datasource datasource);

    void findOne(String id);

    void queryDatasources();



}
