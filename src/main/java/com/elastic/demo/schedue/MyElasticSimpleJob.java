package com.elastic.demo.schedue;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

/**
 * Created by liwenqing on 2018/8/21.
 */
public class MyElasticSimpleJob implements SimpleJob{
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(new Date()+" job名称 = "+shardingContext.getJobName()
                +"分片数量"+shardingContext.getShardingTotalCount()
                +"当前分区"+shardingContext.getShardingItem()
                +"当前分区名称"+shardingContext.getShardingParameter()
                +"当前自定义参数"+shardingContext.getJobParameter()+"============start=================");


    }
}
