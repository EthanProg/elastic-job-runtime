package com.elastic.demo.config;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.elastic.demo.annotation.ElasticSimpleJob;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class ElasticJobAutoConfiguration {

//    @Autowired
//    private JobSchedulerRegistry jobSchedulerRegistry;
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @PostConstruct
//    public void initElasticJob() {
//        Map<String, SimpleJob> map = applicationContext.getBeansOfType(SimpleJob.class);
//        for (Map.Entry<String, SimpleJob> entry : map.entrySet()) {
//            SimpleJob simpleJob = entry.getValue();
//            ElasticSimpleJob elasticJobAnnotation = simpleJob.getClass().getAnnotation(ElasticSimpleJob.class);
//
//            if (elasticJobAnnotation == null) {
//                continue;
//            }
//
//            String dataSourceRef = elasticJobAnnotation.dataSource();
//            DataSource dataSource = null;
//            if (StringUtils.isNotBlank(dataSourceRef)) {
//
//                if (!applicationContext.containsBean(dataSourceRef)) {
//                    throw new RuntimeException("not exist datasource [" + dataSourceRef + "] !");
//                }
//
//                dataSource = (DataSource) applicationContext.getBean(dataSourceRef);
//            }
//            jobSchedulerRegistry.registry(simpleJob,
//                    StringUtils.defaultIfBlank(elasticJobAnnotation.jobName(), simpleJob.getClass().getName()),
//                    StringUtils.defaultIfBlank(elasticJobAnnotation.cron(), elasticJobAnnotation.value()),
//                    Integer.valueOf(elasticJobAnnotation.shardingTotalCount()),
//                    elasticJobAnnotation.shardingItemParameters(),
//                    elasticJobAnnotation.jobParameter(),
//                    elasticJobAnnotation.description(),
//                    BooleanUtils.toBoolean(elasticJobAnnotation.disabled()),
//                    BooleanUtils.toBoolean(elasticJobAnnotation.overwrite()),
//                    dataSource);
//        }
//    }
}