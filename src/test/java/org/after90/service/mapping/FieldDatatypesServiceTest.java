package org.after90.service.mapping;

import com.after00.Application;
import com.after00.service.mapping.FieldDatatypesService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class FieldDatatypesServiceTest {
    @Autowired
    private FieldDatatypesService fieldDatatypes;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testArrayDatatype() throws Exception {
        fieldDatatypes.arrayDatatype();
    }

    @Test
    public void testIpDatatype() throws Exception {
        fieldDatatypes.ipDatatype();
    }


} 
