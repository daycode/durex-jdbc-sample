package cn.daycode.server;

import cn.daycode.spring.annotation.RepositoryScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.daycode")
@RepositoryScan(basePackages = "cn.daycode.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
