package cn.zerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月06日 17:32
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
