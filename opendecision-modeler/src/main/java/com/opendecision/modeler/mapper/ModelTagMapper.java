package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.ModelTag;
import com.opendecision.modeler.util.MyMapper;

public interface ModelTagMapper extends MyMapper<ModelTag> {

    int deleteByPrimaryKey(String id);

    ModelTag selectByPrimaryKey(String id);
}