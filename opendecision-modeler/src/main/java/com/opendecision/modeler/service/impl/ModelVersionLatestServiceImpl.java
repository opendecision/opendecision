package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.ModelVersionLatest;
import com.opendecision.modeler.mapper.ModelVersionLatestMapper;
import com.opendecision.modeler.service.ModelVersionLatestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelVersionLatestServiceImpl implements ModelVersionLatestService {

    @Autowired
    private ModelVersionLatestMapper modelVersionLatestMapper;

    private ModelVersionLatest getById(String id) {
        return modelVersionLatestMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return modelVersionLatestMapper.deleteByPrimaryKey(id);
    }

    private int updateById(ModelVersionLatest modelVersion) {
        return modelVersionLatestMapper.updateByPrimaryKey(modelVersion);
    }

    private int insert(ModelVersionLatest modelVersion) {
        return modelVersionLatestMapper.insert(modelVersion);
    }







}
