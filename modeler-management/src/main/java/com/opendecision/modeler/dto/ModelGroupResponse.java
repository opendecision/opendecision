package com.opendecision.modeler.dto;

import java.util.List;

public class ModelGroupResponse {

    private String id;

    private String parentId;

    private String name;

    private List<ModelGroupResponse> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public List<ModelGroupResponse> getChildren() {
        return children;
    }

    public void setChildren(List<ModelGroupResponse> children) {
        this.children = children;
    }
}
