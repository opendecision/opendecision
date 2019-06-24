package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Dataset;
import com.opendecision.modeler.mapper.DatasetMapper;
import com.opendecision.modeler.service.DatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasetServiceImpl implements DatasetService {

    @Autowired
    private DatasetMapper datasetMapper;

    private Dataset getById(String id) {
        return datasetMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return datasetMapper.deleteByPrimaryKey(id);
    }

    private int updateById(Dataset model) {
        return datasetMapper.updateByPrimaryKey(model);
    }

    private int insert(Dataset model) {
        return datasetMapper.insert(model);
    }
}
