package cn.net.lijinya.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages = "cn.net.lijinya.mapper")
@Configuration
public class ApplicationConfig {
}
