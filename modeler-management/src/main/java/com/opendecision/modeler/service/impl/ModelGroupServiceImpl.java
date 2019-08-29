package com.opendecision.modeler.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.mapper.ModelGroupMapper;
import com.opendecision.modeler.service.ModelGroupService;
import com.opendecision.modeler.web.request.ModelGroupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelGroupServiceImpl implements ModelGroupService {

    @Autowired
    private ModelGroupMapper modelGroupMapper;

    private ModelGroup getById(String id) {
        return modelGroupMapper.selectById(id);
    }

    private int deleteById(String id) {
        return modelGroupMapper.deleteById(id);
    }

    private int updateById(ModelGroup modelGroup) {
        return modelGroupMapper.updateById(modelGroup);
    }

    private int insert(ModelGroup modelGroup) {
        return modelGroupMapper.insert(modelGroup);
    }


    @Override
    public IPage<ModelGroup> findModelGroupPage(ModelGroupRequest request) {

        BaseAction query = pageParams.mapToObject(BaseAction.class);
        QueryWrapper<BaseAction> queryWrapper = new QueryWrapper();
        queryWrapper.lambda()
                .likeRight(ObjectUtils.isNotEmpty(query.getActionCode()), BaseAction::getActionCode, query.getActionCode())
                .likeRight(ObjectUtils.isNotEmpty(query.getActionName()), BaseAction::getActionName, query.getActionName());
        queryWrapper.orderByDesc("create_time");
        return modelGroupMapper.selectPage(new Page(pageParams.getPage(), pageParams.getLimit()), queryWrapper);
    }

    @Override
    public void addModelGroup(ModelGroupRequest request) {

        insert(request.toModelGroup());
    }

    @Override
    public void updateModelGroup(String id, ModelGroupRequest request) {

        ModelGroup modelGroup = request.toModelGroup();
//        modelGroup.setId(id);
        updateById(modelGroup);
    }

    @Override
    public void deleteModelGroup(String id) {
        deleteById(id);
    }
}
