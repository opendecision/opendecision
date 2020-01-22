package com.opendecision.modeler.mapper;


import com.opendecision.modeler.domain.ModelGroup;
import com.opendecision.modeler.dto.ModelGroupResponse;
import com.opendecision.mybatis.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelGroupMapper extends SuperMapper<ModelGroup> {

    List<ModelGroupResponse> selectByParentId(@Param("parentId") String parentId);

}