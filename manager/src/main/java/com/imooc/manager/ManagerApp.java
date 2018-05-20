package com.imooc.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 管理端启动类
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.imooc.entity"}) //添加扫描路径
public class ManagerApp {

    public static void main(String[] args){
        SpringApplication.run(ManagerApp.class);
    }

}
