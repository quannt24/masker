package com.example.masker.worker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyWorker {

    @Scheduled(fixedRate = 10000)
    public void fixedRateTask() {
        log.info("Nothing important");
    }

}
