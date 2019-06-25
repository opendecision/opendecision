package com.opendecision.modeler.service;

import com.opendecision.modeler.domain.Resource;

public interface ResourceService {

    Resource findOne(String id);

    void queryResources();

    void uploadResource();

    void deleteResource(String id);

    void updateResource(Resource resource);

    void saveResource(Resource resource);
}
