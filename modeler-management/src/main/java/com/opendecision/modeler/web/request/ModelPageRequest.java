package com.opendecision.modeler.web.request;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.Model;

public class ModelPageRequest {

    private IPage<Model> iPage;

    private String name;

    private int page;

    private int size;

    public ModelPageRequest() {
       iPage.setCurrent(this.page);
       iPage.setSize(this.size);
    }

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

    public IPage<Model> getiPage() {
        return iPage;
    }

    public void setiPage(IPage<Model> iPage) {
        this.iPage = iPage;
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
