package cn.zerry.controller;

import cn.zerry.bean.User;
import cn.zerry.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月07日 9:49
 */
@RestController
public class FeignController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("LZR")).append("\n");
        sb.append(helloService.hello("LZR", 30)).append("\n");
        sb.append(helloService.hello(new User("LZR", 30))).append("\n");
        return sb.toString();
    }
}
