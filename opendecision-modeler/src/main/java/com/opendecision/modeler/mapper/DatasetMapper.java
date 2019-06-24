package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.Dataset;
import com.opendecision.modeler.util.MyMapper;

public interface DatasetMapper extends MyMapper<Dataset> {

    int deleteByPrimaryKey(String id);


    Dataset selectByPrimaryKey(String id);


}