package com.opendecision.modeler.mapper;

import com.opendecision.modeler.domain.ModelGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelGroupMapperTest {

    @Autowired
    private ModelGroupMapper modelGroupMapper;

    @Test
    public void testFind() {

        ModelGroup modelGroup = modelGroupMapper.selectById("1");




    }
}
