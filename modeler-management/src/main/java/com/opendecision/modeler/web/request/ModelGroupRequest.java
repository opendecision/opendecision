package com.opendecision.modeler.web.request;

import com.opendecision.modeler.domain.ModelGroup;

public class ModelGroupRequest {

    private String parentId;

    private String name;

    private Integer page;

    private Integer rows;

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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public ModelGroup toModelGroup() {

        ModelGroup modelGroup = new ModelGroup();
        modelGroup.setName(getName());
        modelGroup.setParentId(getParentId());
        return modelGroup;
    }
}
