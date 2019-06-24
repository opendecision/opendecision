package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.ModelVersion;
import com.opendecision.modeler.util.MyMapper;

public interface ModelVersionMapper extends MyMapper<ModelVersion> {

    int deleteByPrimaryKey(String id);


    ModelVersion selectByPrimaryKey(String id);
}