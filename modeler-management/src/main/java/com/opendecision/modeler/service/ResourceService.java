package com.opendecision.modeler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.opendecision.modeler.domain.Resource;
import com.opendecision.modeler.web.request.ResourcePageRequest;
import com.opendecision.modeler.web.request.ResourceRequest;

public interface ResourceService {

    Resource findOne(String id);

    void queryResources();

    void uploadResource();

    void deleteResource(String id);

    void updateResource(String id, ResourceRequest resourceRequest);

    void saveResource(Resource resource);

    void downloadResource(String id);

    IPage<Resource> findAll(IPage<Resource> page, ResourcePageRequest pageRequest);
}
