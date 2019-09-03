package com.opendecision.modeler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.web.request.ModelGroupPageRequest;
import com.opendecision.modeler.web.request.ModelGroupRequest;

public interface ModelGroupService {


    IPage<ModelGroup> findAll(IPage<ModelGroup> page, ModelGroupPageRequest pageRequest);

    void addModelGroup(ModelGroupRequest request);

    void updateModelGroup(String id, ModelGroupRequest request);

    void deleteModelGroup(String id);

}
