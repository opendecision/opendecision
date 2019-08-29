package com.opendecision.rule.mapper;

import com.opendecision.mybatis.mapper.SuperMapper;
import com.opendecision.rule.domain.Rule;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleMapper extends SuperMapper<Rule> {

}
