package com.hzwq.zeusauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.hzwq.zeusauth.dao")
@SpringBootApplication
public class ZeusAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeusAuthApplication.class, args);
    }

}
