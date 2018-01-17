package com.zhangguo.Spring052.aop09;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 容器的配置类
 */
@Configuration
@ComponentScan(basePackages="com.zhangguo.Spring052.aop09")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ApplicationCfg {
}
