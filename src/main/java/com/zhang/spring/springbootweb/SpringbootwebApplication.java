package com.zhang.spring.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动器
 * 不能和conntroller 在平行包下或位于controller的子包下
 */
@SpringBootApplication
@ServletComponentScan //在启动器 启动的时候识别@WebServlet
@MapperScan("classpath*:mapper/*.xml")
public class SpringbootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebApplication.class, args);


    }

}
