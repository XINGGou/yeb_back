package com.xxh.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * yeb_back启动类
 * @author xxh
 * @date 2021/2/23 12:02
 */

@SpringBootApplication
@MapperScan("com.xxh.server.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);
    }
}
