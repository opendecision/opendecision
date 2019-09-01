package com.opendecision.modeler.service.impl;

import com.opendecision.modeler.domain.Resource;
import com.opendecision.modeler.mapper.ResourceMapper;
import com.opendecision.modeler.service.ResourceService;
import com.opendecision.modeler.web.request.ResourceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.fs.FsShell;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Autowired
    private FsShell shell;


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

        Resource resource = resourceMapper.selectById(id);
        shell.rm(resource.getPath());
        resourceMapper.deleteById(id);
    }

    @Override
    public void updateResource(String id, ResourceRequest resourceRequest) {

    }

    @Override
    public void saveResource(Resource resource) {

        shell.put("","");
        insert(resource);

    }

    @Override
    public void downloadResource(String id) {

        Resource resource = resourceMapper.selectById(id);

        shell.get(resource.getPath(), "");
    }
}
