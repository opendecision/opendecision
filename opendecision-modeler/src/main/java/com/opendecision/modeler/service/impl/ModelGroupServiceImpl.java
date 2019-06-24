package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.mapper.ModelGroupMapper;
import com.opendecision.modeler.service.ModelGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelGroupServiceImpl implements ModelGroupService {

    @Autowired
    private ModelGroupMapper modelGroupMapper;

    private ModelGroup getById(String id) {
        return modelGroupMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return modelGroupMapper.deleteByPrimaryKey(id);
    }

    private int updateById(ModelGroup modelGroup) {
        return modelGroupMapper.updateByPrimaryKey(modelGroup);
    }

    private int insert(ModelGroup modelGroup) {
        return modelGroupMapper.insert(modelGroup);
    }
}
