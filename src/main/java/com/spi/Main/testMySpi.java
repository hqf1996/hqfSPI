package com.spi.Main;

import com.spi.fun.Method;
import com.spi.loader.myExtensionLoader;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 13:56 2020/1/1
 * @Modified By:
 */
public class testMySpi {
    public static void main(String[] args) {
        // 默认的
        myExtensionLoader<Method> extensionLoader = myExtensionLoader.getExtensionLoader(Method.class);
        Method method = extensionLoader.getDefaultExtension();
        method.sayHello();
        // 指定名称的
        Method method2 = extensionLoader.getExtension("method2");
        method2.sayHello();
    }
}
