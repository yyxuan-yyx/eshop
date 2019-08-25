package com.yzxie.study.seckillapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Author: xieyizun
 * Version: 1.0
 * Date: 2019-08-25
 * Description:
 **/
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource("classpath:dubbo_consumer.xml")
public class DubboConfig {
}
