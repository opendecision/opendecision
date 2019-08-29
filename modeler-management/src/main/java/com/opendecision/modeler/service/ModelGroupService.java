package com.opendecision.modeler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.web.request.ModelGroupRequest;

public interface ModelGroupService {


    IPage<ModelGroup> findModelGroupPage(ModelGroupRequest request);

    void addModelGroup(ModelGroupRequest request);

    void updateModelGroup(String id, ModelGroupRequest request);

    void deleteModelGroup(String id);

}
