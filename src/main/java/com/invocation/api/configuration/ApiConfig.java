package com.invocation.api.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ApiConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);  // Number of threads to start with
        executor.setMaxPoolSize(20);   // Maximum number of threads
        executor.setQueueCapacity(100); // Queue size before threads are exhausted
        executor.setThreadNamePrefix("async-");
        executor.initialize();
        return executor;
    }
}

