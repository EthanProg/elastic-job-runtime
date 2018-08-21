package com.elastic.demo.config;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author: ldz
 * @Date: 2018-05-15 17:12
 */
@Component
public class JobSchedulerRegistry {

//    //  注册中心配置
//    @Resource
//    private ZookeeperRegistryCenter regCenter;
//
//    /* 作业配置
//     作业配置分为3级，分别是JobCoreConfiguration，JobTypeConfiguration和LiteJobConfiguration。
//     LiteJobConfiguration使用JobTypeConfiguration，JobTypeConfiguration使用JobCoreConfiguration，层层嵌套。
//     JobTypeConfiguration根据不同实现类型分为SimpleJobConfiguration，DataflowJobConfiguration和ScriptJobConfiguration。*/
//    private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass, final String jobName, final String cron, final int shardingTotalCount, final String shardingItemParameters, final String jobParameter, final String description, final boolean disabled, final boolean overwrite) {
//        return LiteJobConfiguration.newBuilder(new SimpleJobConfiguration(JobCoreConfiguration.newBuilder(
//                jobName, cron, shardingTotalCount).description(description).shardingItemParameters(shardingItemParameters).jobParameter(jobParameter).build(),
//                jobClass.getCanonicalName())).disabled(disabled).overwrite(overwrite).build();
//    }
//
//    public void registry(final SimpleJob simpleJob, final String jobName, final String cron, final int shardingTotalCount,  final String shardingItemParameters, final String jobParameter, final String description, final boolean disabled, final boolean overwrite, DataSource dataSource) {
//        LiteJobConfiguration liteJobConfiguration = getLiteJobConfiguration(simpleJob.getClass(), jobName, cron, shardingTotalCount, shardingItemParameters, jobParameter, description, disabled, overwrite);
//        if (dataSource != null) {
//            new SpringJobScheduler(simpleJob, regCenter, liteJobConfiguration, new JobEventRdbConfiguration(dataSource)).init();
//        } else {
//            new SpringJobScheduler(simpleJob, regCenter, liteJobConfiguration).init();
//        }
//    }

}
