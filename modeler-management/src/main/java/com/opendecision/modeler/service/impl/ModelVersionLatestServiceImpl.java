package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.mapper.ModelVersionLatestMapper;
import com.opendecision.modeler.service.ModelVersionLatestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelVersionLatestServiceImpl implements ModelVersionLatestService {

    @Autowired
    private ModelVersionLatestMapper modelVersionLatestMapper;







}
