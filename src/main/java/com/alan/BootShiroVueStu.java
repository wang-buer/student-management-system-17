package com.alan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.alan.mapper")
public class BootShiroVueStu {
    public static void main(String[] args) {
        SpringApplication.run(BootShiroVueStu.class,args);
    }
}
