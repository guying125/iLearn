package com.guying.ilearn.anno;

import java.lang.annotation.*;

/**
 * 描述:
 *
 * @author : qingjun
 * @version : 1.0
 * @date : 2022/12/17 09:44
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
public @interface Excel2 {
    String name() default "";

    String dictVal() default "";
}
