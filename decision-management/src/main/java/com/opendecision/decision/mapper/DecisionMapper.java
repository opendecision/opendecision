package com.opendecision.decision.mapper;

import com.opendecision.decision.domain.Decision;
import com.opendecision.mybatis.mapper.SuperMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionMapper extends SuperMapper<Decision> {

}
