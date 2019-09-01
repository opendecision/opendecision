package com.opendecision.modeler.service;

import com.opendecision.modeler.domain.Resource;
import com.opendecision.modeler.web.request.ResourceRequest;

public interface ResourceService {

    Resource findOne(String id);

    void queryResources();

    void uploadResource();

    void deleteResource(String id);

    void updateResource(String id, ResourceRequest resourceRequest);

    void saveResource(Resource resource);

    void downloadResource(String id);
}
