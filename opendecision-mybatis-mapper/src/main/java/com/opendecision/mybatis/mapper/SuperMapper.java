package com.opendecision.mybatis.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;


public interface SuperMapper<T> extends BaseMapper<T> {

    IPage<T> pageList(Page<T> page, @Param("ew") Wrapper<?> wrapper);

}
