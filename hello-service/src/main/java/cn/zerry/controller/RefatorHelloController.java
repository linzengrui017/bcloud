package cn.zerry.controller;

import cn.zerry.dto.User;
import cn.zerry.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月07日 11:19
 */
@RestController
public class RefatorHelloController implements HelloService{

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "hello " + user.getName() + ", " + user.getAge();
    }
}
