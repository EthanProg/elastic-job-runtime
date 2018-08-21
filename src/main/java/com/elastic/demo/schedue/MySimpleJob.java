package com.elastic.demo.schedue;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.elastic.demo.annotation.ElasticSimpleJob;

/**
 * @Author: ldz
 * @Date: 2018-05-04 15:29
 */
@ElasticSimpleJob(cron = "0/10 * * * * ?", jobName = "test12344",
        shardingTotalCount = 3, jobParameter = "测试参数",
        shardingItemParameters = "0=A,1=B,2=C", dataSource = "dataSource")
public class MySimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("JobName:" + shardingContext.getJobName() + " " + "JobParameter:" + shardingContext.getJobParameter() + " " + "ShardingItem:" + shardingContext.getShardingItem() + " " +
                                    "ShardingParameter:" + shardingContext.getShardingParameter() + " " + "ShardingTotalCount:" + shardingContext.getShardingTotalCount() + " " +
                                    "TaskId:" + shardingContext.getTaskId());
        System.out.println("---------------------------------------");

        /**
         * 实际开发中，有了任务总片数和当前分片项，就可以对任务进行分片执行了
         * 比如 SELECT * FROM user WHERE status = 0 AND MOD(id, shardingTotalCount) = shardingItem
         */
//        List<Test> list = testService.list(shardingContext.getShardingTotalCount(), shardingContext.getShardingItem());
//
//        String sign = System.getProperty("server.port");
//        for (Test test : list) {
//            testService.update(test.getId(), sign);
//            System.out.println(DateFormatUtils.format(new Date(), "yyyy-mm-dd HH:mm:ss:SSS"));
//            System.out.println("update " + test.getId() + "    " + test.getTotalCount() + "    " + " by " + sign);
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
