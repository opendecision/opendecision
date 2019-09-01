package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.mapper.DatasourceMapper;
import com.opendecision.modeler.service.DatasourceService;
import com.opendecision.modeler.web.request.DatasourceRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.fs.FsShell;
import org.springframework.stereotype.Service;

@Service
public class DatasourceServiceImpl implements DatasourceService {

    @Autowired
    private DatasourceMapper datasourceMapper;

    @Autowired
    private FsShell shell;

    private String BasePath = "/modeler";

    @Override
    public void createDatasource(DatasourceRequest datasourceRequest) {

        String datasourcePath = null;

        if (StringUtils.isNotBlank(datasourceRequest.getParentId())) {

        } else {
            datasourcePath = BasePath + datasourceRequest.getName();
        }

        shell.mkdir(datasourcePath);
        Datasource datasource = new Datasource();
        datasourceMapper.insert(datasource);
    }

    @Override
    public void deleteDatasource(String id) {

        datasourceMapper.deleteById(id);
    }

    @Override
    public void updateDatasource(Datasource datasource) {

    }

    @Override
    public void findOne(String id) {

        datasourceMapper.selectById(id);
    }

    @Override
    public void queryDatasources() {

    }
}
