package com.opendecision.modeler.domain;

public class ModelVersion extends BaseEntity {

    private String versionId;

    private String name;

    private String algorithm; // model算法

    private String version; // 版本号

    private String format; //格式 jar,pmml

    private String modelEvaluatorVersion;

    private String modelSize;

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
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

    public String getModelEvaluatorVersion() {
        return modelEvaluatorVersion;
    }

    public void setModelEvaluatorVersion(String modelEvaluatorVersion) {
        this.modelEvaluatorVersion = modelEvaluatorVersion;
    }

    public String getModelSize() {
        return modelSize;
    }

    public void setModelSize(String modelSize) {
        this.modelSize = modelSize;
    }
}
