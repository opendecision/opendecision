package com.opendecision.modeler.domain;

import com.opendecision.mybatis.mapper.BaseEntity;

/**
 * 数据
 */
public class Resource extends BaseEntity {

    private String datasourceId;

    private String name;

    private String size;

    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
