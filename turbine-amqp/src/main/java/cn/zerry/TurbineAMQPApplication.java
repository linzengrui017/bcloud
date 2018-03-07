package cn.zerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月06日 18:01
 */
@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineAMQPApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineAMQPApplication.class, args);
    }
}
