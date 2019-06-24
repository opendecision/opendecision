package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.Model;
import com.opendecision.modeler.util.MyMapper;

public interface ModelMapper extends MyMapper<Model> {


    int deleteByPrimaryKey(String id);


    Model selectByPrimaryKey(String id);

}