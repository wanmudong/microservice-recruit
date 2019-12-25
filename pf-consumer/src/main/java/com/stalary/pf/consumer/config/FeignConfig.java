package com.stalary.pf.consumer.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FeignConfig
 *
 * @author lirongqian
 * @since 2018/10/17
 */
@Configuration
public class FeignConfig {

    @Bean
    public Request.Options options() {
        // 超时20s
        return new Request.Options(20000, 20000);
    }

    @Bean
    public Retryer feignRetryer() {
        // 重试0次
        return new Retryer.Default(100, 1000, 0);
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}