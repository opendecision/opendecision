package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.ModelTag;
import com.opendecision.modeler.mapper.ModelTagMapper;
import com.opendecision.modeler.service.ModelTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelTagServiceImpl implements ModelTagService {

    @Autowired
    private ModelTagMapper modelTagMapper;

    private ModelTag getById(String id) {
        return modelTagMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return modelTagMapper.deleteByPrimaryKey(id);
    }

    private int updateById(ModelTag modelTag) {
        return modelTagMapper.updateByPrimaryKey(modelTag);
    }

    private int insert(ModelTag modelTag) {
        return modelTagMapper.insert(modelTag);
    }




}
