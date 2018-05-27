package com.imooc.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置类
 */
@Configuration
@ComponentScan(basePackages = "com.imooc.swagger")
@EnableSwagger2
public class SwaggerConfiguration {

    @Autowired
    private SwaggerInfo swaggerInfo;

    @Bean
    public Docket controllerApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName(swaggerInfo.getGroupName())
                .apiInfo(apiInfo());
        ApiSelectorBuilder builder = docket.select();
        if (!StringUtils.isEmpty(swaggerInfo.getBasePackage())){ //是否配置了扫描包名
            builder = builder.apis(RequestHandlerSelectors.basePackage(swaggerInfo.getBasePackage()));
        }
        if (!StringUtils.isEmpty(swaggerInfo.getAntPath())){ //是否配置了路径
            builder = builder.paths(PathSelectors.ant(swaggerInfo.getAntPath()));

        }
        return builder.build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title(swaggerInfo.getTitle()) //标题
                .description(swaggerInfo.getDescription())//描述
                .termsOfServiceUrl("http://springfox.io")
                .contact("imooc")
                .license(swaggerInfo.getLicense())//版本
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

}
