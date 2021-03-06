package com.opendecision.modeler.domain;

import com.opendecision.mybatis.mapper.BaseEntity;

/**
 * 数据源分组，HIVE,HDFS,File
 */
public class Datasource extends BaseEntity {

    private String parentId;

    private String name;

    private Double size;

    private String type;

    private String path;

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

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}