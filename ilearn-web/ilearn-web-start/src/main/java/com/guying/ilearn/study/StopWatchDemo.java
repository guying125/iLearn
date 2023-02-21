package com.guying.ilearn.study;

import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * 描述:
 *
 * @author : qingjun
 * @version : 1.0
 * @date : 2022/8/24 12:25
 **/
public class StopWatchDemo {
    public static void main(String[] args) throws InterruptedException {
        Long startTime = System.currentTimeMillis();
        // 你的业务代码
        Thread.sleep(10);
        Long endTime = System.currentTimeMillis();
        double elapsedTime = (endTime - startTime) / 1000.0;
        System.out.println("该段总共耗时：" + elapsedTime + "s");

        System.out.println("############################################");


        StopWatch stopWatch = new StopWatch();

        // 任务一模拟休眠1秒钟
        stopWatch.start("TaskOneName");
        Thread.sleep(1000);
        System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        // 任务一模拟休眠1秒钟
        stopWatch.start("TaskTwoName");
        Thread.sleep(1000);
        System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        // 任务一模拟休眠1秒钟
        stopWatch.start("TaskThreeName");
        Thread.sleep(1000);
        System.out.println("当前任务名称：" + stopWatch.currentTaskName());
        stopWatch.stop();

        System.out.println("######################打印出耗时1######################");
        // 打印出耗时
        System.out.println(stopWatch.prettyPrint());
        System.out.println("######################打印出耗时2######################");
        System.out.println(stopWatch.shortSummary());
        System.out.println("######################stop后它的值为null######################");
        // stop后它的值为null
        System.out.println(stopWatch.currentTaskName());

        System.out.println("######################最后一个任务的相关信息######################");
        // 最后一个任务的相关信息
        System.out.println(stopWatch.getLastTaskName());
        StopWatch.TaskInfo lastTaskInfo = stopWatch.getLastTaskInfo();
        System.out.println(lastTaskInfo);
        System.out.println(lastTaskInfo.getTaskName() + " | " + lastTaskInfo.getTimeMillis() + " | " + lastTaskInfo.getTimeSeconds());

        System.out.println("######################任务总的耗时 如果你想获取到每个任务详情（包括它的任务名、耗时等等）可使用######################");
        // 任务总的耗时 如果你想获取到每个任务详情（包括它的任务名、耗时等等）可使用
        System.out.println("所有任务总耗时：" + stopWatch.getTotalTimeMillis());
        System.out.println("任务总数：" + stopWatch.getTaskCount());
        System.out.println("所有任务详情：" + Arrays.toString(stopWatch.getTaskInfo()));
    }
}
