package cn.zerry.controller;

import cn.zerry.bean.User;
import cn.zerry.service.HelloService;
import cn.zerry.service.RefactorHelloService;
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
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("LZR")).append("\n");
        sb.append(refactorHelloService.hello("LZR", 30)).append("\n");
        sb.append(refactorHelloService.hello(new cn.zerry.dto.User("LZR", 30))).append("\n");
        return sb.toString();
    }

}
