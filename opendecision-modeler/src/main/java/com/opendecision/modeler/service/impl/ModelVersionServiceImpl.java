package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.ModelVersion;
import com.opendecision.modeler.mapper.ModelVersionMapper;
import com.opendecision.modeler.service.ModelVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelVersionServiceImpl implements ModelVersionService {

    @Autowired
    private ModelVersionMapper modelVersionMapper;


    private ModelVersion getById(String id) {
        return modelVersionMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return modelVersionMapper.deleteByPrimaryKey(id);
    }

    private int updateById(ModelVersion modelVersion) {
        return modelVersionMapper.updateByPrimaryKey(modelVersion);
    }

    private int insert(ModelVersion modelVersion) {
        return modelVersionMapper.insert(modelVersion);
    }
}
