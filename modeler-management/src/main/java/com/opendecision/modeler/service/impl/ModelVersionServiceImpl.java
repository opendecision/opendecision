package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.mapper.ModelVersionMapper;
import com.opendecision.modeler.service.ModelVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelVersionServiceImpl implements ModelVersionService {

    @Autowired
    private ModelVersionMapper modelVersionMapper;


}
