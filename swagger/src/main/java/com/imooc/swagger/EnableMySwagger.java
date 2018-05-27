package com.imooc.swagger;


import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * 开启swagger文档自动生成功能
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Documented
@Import(SwaggerConfiguration.class)
@EnableSwagger2
public @interface EnableMySwagger {
}
