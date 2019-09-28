package com.opendecision.modeler.web.request;

import com.opendecision.modeler.domain.Model;

public class ModelRequest {

    private String modelGroupId;

    private String name;

    private String algorithm; // model算法

    private String version; // 版本号

    private String format; //格式 jar,pmml

    private String evaluatorVersion;

    private String modelSize;

    private String describe;

    public String getModelGroupId() {
        return modelGroupId;
    }

    public void setModelGroupId(String modelGroupId) {
        this.modelGroupId = modelGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public String getModelSize() {
        return modelSize;
    }

    public void setModelSize(String modelSize) {
        this.modelSize = modelSize;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Model buildModel() {
        Model model = new Model();
        model.setModelGroupId(this.modelGroupId);
        model.setName(this.name);
        model.setAlgorithm(this.algorithm);
        model.setVersion(this.version);
        model.setEvaluatorVersion(this.evaluatorVersion);
        model.setFormat(this.format);
        model.setDescribe(this.describe);
        return model;
    }
}
