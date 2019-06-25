package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Resource;
import com.opendecision.modeler.mapper.ResourceMapper;
import com.opendecision.modeler.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    private Resource getById(String id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    private int deleteById(String id) {
        return resourceMapper.deleteByPrimaryKey(id);
    }

    private int updateById(Resource resource) {
        return resourceMapper.updateByPrimaryKey(resource);
    }

    private int insert(Resource resource) {
        return resourceMapper.insert(resource);
    }

    @Override
    public Resource findOne(String id) {
        return null;
    }

    @Override
    public void queryResources() {

    }

    @Override
    public void uploadResource() {

    }

    @Override
    public void deleteResource(String id) {

    }

    @Override
    public void updateResource(Resource resource) {

    }

    @Override
    public void saveResource(Resource resource) {

        insert(resource);

    }
}
