package com.opendecision.modeler.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.Datasource;
import com.opendecision.modeler.mapper.DatasourceMapper;
import com.opendecision.modeler.service.DatasourceService;
import com.opendecision.modeler.web.request.DatasourcePageRequest;
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
    public IPage<Datasource> findAll(IPage<Datasource> page, DatasourcePageRequest datasourcePageRequest) {

        Datasource query = datasourcePageRequest.buildDatasource();
        QueryWrapper<Datasource> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda()
//                .eq(ObjectUtils.isNotEmpty(query.getId()), Datasource::getId, query.getId())
//                .eq(ObjectUtils.isNotEmpty(query.getName()), Datasource::getName, query.getName());
        queryWrapper.orderByDesc("id");
        return datasourceMapper.selectPage(page, queryWrapper);
    }
}
