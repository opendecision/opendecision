package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Model;
import com.opendecision.modeler.mapper.ModelMapper;
import com.opendecision.modeler.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void getModelById(String id) {

    }

    @Override
    public void saveModel() {

    }

    @Override
    public void publishModel() {

    }

    private Model getById(String id) {
        return modelMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return modelMapper.deleteByPrimaryKey(id);
    }

    private int updateById(Model model) {
        return modelMapper.updateByPrimaryKey(model);
    }

    private int insert(Model model) {
        return modelMapper.insert(model);
    }

}
