package com.opendecision.modeler.web.request;

import com.opendecision.modeler.domain.ModelGroup;

public class ModelGroupRequest {

    private String parentId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ModelGroup toModelGroup() {

        ModelGroup modelGroup = new ModelGroup();
        modelGroup.setName(getName());
        modelGroup.setParentId(getParentId());
        return modelGroup;
    }
}
