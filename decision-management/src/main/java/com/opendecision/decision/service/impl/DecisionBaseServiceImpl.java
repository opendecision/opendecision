package com.opendecision.decision.service.impl;

import com.opendecision.decision.mapper.DecisionMapper;
import com.opendecision.decision.service.DecisionBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecisionBaseServiceImpl implements DecisionBaseService {

    @Autowired
    private DecisionMapper decisionMapper;


}
