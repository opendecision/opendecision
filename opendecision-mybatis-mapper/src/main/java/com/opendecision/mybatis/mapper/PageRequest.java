package com.opendecision.mybatis.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.Map;

public class PageRequest extends Page implements Serializable {

    private int page = 1;
    private int limit = 10;
    private String sort;
    private String order;
    private Map<String, Object> requestMap = Maps.newHashMap();
    /**
     * 排序
     */
    private String orderBy;
}
