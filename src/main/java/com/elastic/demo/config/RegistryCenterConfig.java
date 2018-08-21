package com.elastic.demo.config;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册中心配置
 * 用于注册和协调作业分布式行为的组件，目前仅支持Zookeeper。
 */
@Configuration
public class RegistryCenterConfig {

//    @Bean(initMethod = "init")
//    public ZookeeperRegistryCenter regCenter() {
//        String serverList = "10.10.250.130:12181,10.10.250.141:12181,10.10.250.142:12181";
//        String namespace = "simple-ej-ns";
//        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverList, namespace));
//    }

}
