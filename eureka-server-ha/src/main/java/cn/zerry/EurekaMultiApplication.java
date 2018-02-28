package cn.zerry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年02月28日 11:39
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMultiApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaMultiApplication.class).web(true).run(args);
    }
}
