package com.opendecision.modeler.web.request;

import com.opendecision.modeler.domain.Model;

public class ModelPageRequest {

    private String name;

    private int page;

    private int size;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model buildModel() {
        Model model = new Model();
        model.setName(this.name);
        return model;
    }
}
