package com.spi.Main;

import com.spi.fun.Method;

import java.util.ServiceLoader;

/**
 * @Author: hqf
 * @description: jdk spi的简单使用
 * @Data: Create in 13:52 2020/1/1
 * @Modified By:
 */
public class testMain {
    public static void main(String[] args) {
        ServiceLoader<Method> load = ServiceLoader.load(Method.class);
        load.forEach(Method::sayHello);
    }
}
