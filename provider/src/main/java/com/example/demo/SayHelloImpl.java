package com.example.demo;

import com.leesin.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/4/20 9:11
 * @modified By:
 */

@Service()
public class SayHelloImpl implements ISayHelloService {

    @Override
    public String sayHello() {
        System.out.println("哈哈");
        return "哈哈";
    }

    @Override
    public String sayByeBye(String  a) {
        System.out.println("拜拜");
        return "拜拜";
    }


}
