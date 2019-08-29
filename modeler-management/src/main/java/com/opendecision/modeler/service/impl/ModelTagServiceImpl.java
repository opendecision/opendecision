package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.mapper.ModelTagMapper;
import com.opendecision.modeler.service.ModelTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelTagServiceImpl implements ModelTagService {

    @Autowired
    private ModelTagMapper modelTagMapper;



}
