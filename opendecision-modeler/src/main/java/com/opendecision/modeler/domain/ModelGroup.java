package com.opendecision.modeler.domain;

public class ModelGroup extends BaseEntity {

    private String parentId;

    private String name;


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
