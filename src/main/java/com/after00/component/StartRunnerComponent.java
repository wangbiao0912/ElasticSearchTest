package com.after00.component;

import com.after00.repository.ESRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Component
@Slf4j
@Order(value = 1)
public class StartRunnerComponent implements CommandLineRunner {
    @Autowired
    private ESRepository es;

    @Override
    public void run(String... args) throws Exception {
        //初始化ES连接信息
        log.info("start init es");
        es.buildClient();
        es.bulidBulkProcessor();
        es.buildTemplate();
        log.info("end init es");
//        pressES.data2ES();
    }
}
