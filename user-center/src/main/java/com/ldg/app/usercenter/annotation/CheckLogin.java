package com.ldg.app.usercenter.annotation;

import java.lang.annotation.*;

/**
 * 登录检查注解
 *
 * @author ldg
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckLogin {
}
