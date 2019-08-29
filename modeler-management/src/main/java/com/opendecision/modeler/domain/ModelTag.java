package com.opendecision.modeler.domain;

import com.opendecision.mybatis.mapper.BaseEntity;

public class ModelTag extends BaseEntity {

    private String modelId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
}
