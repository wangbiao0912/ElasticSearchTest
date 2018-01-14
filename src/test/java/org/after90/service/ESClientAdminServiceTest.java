package org.after90.service;

import com.after00.Application;
import com.after00.service.ESClientAdminService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试方法类是否正确
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class ESClientAdminServiceTest {
    @Autowired
    private ESClientAdminService esClientAdmin;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: clusterHealth()
     */
    @Test
    public void testClusterHealth() throws Exception {
        esClientAdmin.clusterHealth();
    }


} 
