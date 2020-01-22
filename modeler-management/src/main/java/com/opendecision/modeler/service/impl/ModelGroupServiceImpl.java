package com.opendecision.modeler.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.dto.ModelGroupResponse;
import com.opendecision.modeler.mapper.ModelGroupMapper;
import com.opendecision.modeler.service.ModelGroupService;
import com.opendecision.modeler.web.request.ModelGroupPageRequest;
import com.opendecision.modeler.web.request.ModelGroupRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public IPage<ModelGroup> findAll(IPage<ModelGroup> page, ModelGroupPageRequest pageRequest) {

        ModelGroup query = pageRequest.buildModelGroup();
        QueryWrapper<ModelGroup> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(ObjectUtils.isNotEmpty(query.getId()), ModelGroup::getId, query.getId())
                .eq(ObjectUtils.isNotEmpty(query.getName()), ModelGroup::getName, query.getName());
        queryWrapper.orderByDesc("create_time");
        return modelGroupMapper.selectPage(page, queryWrapper);
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

    @Override
    public List<ModelGroupResponse> findAll() {

        List<ModelGroupResponse> responseList = modelGroupMapper.selectByParentId(null);
        buildModelGroups(responseList);
        return null;
    }

    private List<ModelGroupResponse> buildChildModelGroups(String parentId) {

        List<ModelGroupResponse> modelGroupResponses = null;
        if (parentId != null) {
            modelGroupResponses = modelGroupMapper.selectByParentId(parentId);
        }

        return modelGroupResponses;
    }

    private void buildModelGroups(List<ModelGroupResponse> responseList) {

        for (ModelGroupResponse modelGroup : responseList) {
            if (StringUtils.isNotBlank(modelGroup.getParentId())) {
                modelGroup.setChildren(buildChildModelGroups(modelGroup.getParentId()));
            }
            buildModelGroups(modelGroup.getChildren());
        }

        
    }
}
