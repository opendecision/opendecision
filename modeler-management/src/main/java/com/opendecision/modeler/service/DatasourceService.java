package com.opendecision.modeler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.web.request.DatasourcePageRequest;
import com.opendecision.modeler.web.request.DatasourceRequest;

public interface DatasourceService {

    void createDatasource(DatasourceRequest datasourceRequest);

    void deleteDatasource(String id);

    void updateDatasource(Datasource datasource);

    void findOne(String id);

    IPage<Datasource> findAll(IPage<Datasource> page, DatasourcePageRequest datasourcePageRequest);

}
