package com.berg.system.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * 示例定时任务
 *
 * @Author Scott
 */
@Slf4j
public class SampleJob{

    @Scheduled(cron = "*/1 * * * * ?")
    public void execute(){

        log.info(String.format("定时任务SampleJob 时间：%s",LocalDateTime.now()));
    }
}