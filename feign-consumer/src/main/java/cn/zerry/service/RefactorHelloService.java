package cn.zerry.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月07日 11:25
 */
@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService{

}
