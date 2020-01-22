package com.opendecision.rule.service.impl;

import com.opendecision.rule.mapper.RuleSetMapper;
import com.opendecision.rule.service.RuleSetService;
import com.opendecision.ruleengine.model.Rule;
import com.opendecision.ruleengine.model.RuleSet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleSetServiceImpl implements RuleSetService {

    private RuleSetMapper ruleSetMapper;

    @Override
    public void generateScript() {

        RuleSet ruleSet = new RuleSet();
        StringBuilder sb = new StringBuilder();
        for (Rule rule : ruleSet.getRules()) {
            sb.append("if(");
            sb.append(rule.getCondition().getValue());
            sb.append("} {\n");
            generateRule(rule.getChildren(), sb);
            sb.append("\n}\n");
        }

    }

    private void generateRule(List<Rule> rules, StringBuilder sb) {
        for (Rule rule : rules) {
            sb.append("if(");
            sb.append(rule.getCondition().getValue());
            sb.append(") (\n");
            if (rule.getChildren().size() > 0) {
                generateRule(rule.getChildren(), sb);
            } else {
                sb.append(rule.getAction().getValue());
            }
            sb.append("\n}\n");
        }
    }
}
