package com.example.springboot.demo.SpringTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ATask {
    private Logger LOGGER = LoggerFactory.getLogger(ATask.class);

    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没支付则取消该订单
     */
//    @Scheduled(cron = "0 0/10 * ? * ?")
    @Scheduled(cron = "*/10 * * * * ?")
    private void cancelTimeOutOrder() {
        LOGGER.info("这是个定时器");
    }
}