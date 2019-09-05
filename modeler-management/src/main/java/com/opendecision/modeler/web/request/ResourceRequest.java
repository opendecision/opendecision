package com.opendecision.modeler.web.request;

import com.opendecision.modeler.domain.Resource;

public class ResourceRequest {

    private String datasourceId;

    private String name;

    private String size;

    private String path;

    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Resource buildResource() {
        Resource resource = new Resource();
        return resource;
    }
}
