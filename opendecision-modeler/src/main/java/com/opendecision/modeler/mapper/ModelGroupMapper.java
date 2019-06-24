package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.util.MyMapper;

public interface ModelGroupMapper extends MyMapper<ModelGroup> {


    int deleteByPrimaryKey(String id);


    ModelGroup selectByPrimaryKey(String id);

}