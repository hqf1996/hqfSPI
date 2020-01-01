package com.spi.fun;

import com.spi.annotation.mySPI;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 13:46 2020/1/1
 * @Modified By:
 */

@mySPI(value = "defaultmethod")
public interface Method {
    void sayHello();
}
