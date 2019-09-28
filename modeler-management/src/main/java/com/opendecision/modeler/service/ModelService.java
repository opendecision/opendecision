package com.opendecision.modeler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.Model;
import com.opendecision.modeler.web.request.ModelPageRequest;
import com.opendecision.modeler.web.request.ModelRequest;

public interface ModelService {

    Model getModelById(String id);

    void saveModel(ModelRequest modelRequest);

    void publishModel();

    void deleteModelById(String id);

    IPage<Model> findAll(IPage<Model> page, ModelPageRequest pageRequest);
}
