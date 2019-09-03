package com.opendecision.modeler.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.opendecision.modeler.domain.Model;
import com.opendecision.modeler.mapper.ModelMapper;
import com.opendecision.modeler.service.ModelService;
import com.opendecision.modeler.web.request.ModelPageRequest;
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

    @Override
    public void deleteModelById(String id) {

        modelMapper.deleteById(id);
    }

    @Override
    public IPage<Model> findAll(IPage<Model> page, ModelPageRequest pageRequest) {

        Model query = pageRequest.buildModel();
        QueryWrapper<Model> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(ObjectUtils.isNotEmpty(query.getId()), Model::getId, query.getId())
                .eq(ObjectUtils.isNotEmpty(query.getName()), Model::getName, query.getName());
        queryWrapper.orderByDesc("create_time");
        return modelMapper.selectPage(page, queryWrapper);

    }


}
