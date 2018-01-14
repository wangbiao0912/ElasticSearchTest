package com.after00.service;

import com.after00.repository.ESRepository;

import org.elasticsearch.action.admin.cluster.health.ClusterHealthResponse;
import org.elasticsearch.cluster.health.ClusterHealthStatus;
import org.elasticsearch.cluster.health.ClusterIndexHealth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ESClientAdminService {
    @Autowired
    private ESRepository es;

    public void clusterHealth() {
        ClusterHealthResponse healths = es.client.admin().cluster().prepareHealth().get();
        String clusterName = healths.getClusterName();
        int numberOfDataNodes = healths.getNumberOfDataNodes();
        int numberOfNodes = healths.getNumberOfNodes();
        log.info("getClusterName:{}, getNumberOfDataNodes:{}, getNumberOfNodes:{}", clusterName, numberOfDataNodes, numberOfNodes);
        for (ClusterIndexHealth health : healths.getIndices().values()) {
            String index = health.getIndex();
            int numberOfShards = health.getNumberOfShards();
            int numberOfReplicas = health.getNumberOfReplicas();
            ClusterHealthStatus status = health.getStatus();
            status.value();
            log.info("index:{}, numberOfShards:{}, numberOfReplicas:{}, status.name:{}, status.value:{}", index, numberOfShards, numberOfReplicas, status.name(), status.value());
        }
    }
}
