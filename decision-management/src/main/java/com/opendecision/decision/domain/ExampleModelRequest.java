package com.opendecision.decision.domain;

import java.io.Serializable;

public class ExampleModelRequest implements Serializable {

    private Long id;

    private String algorithm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
