package com.prj.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig
{
    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.OAS_30)
                // 是否启用Swagger
                .enable(true)
                // 用来指定Swagger信息
                .apiInfo(apiInfo())
                .select()
                // 扫描指定目录的接口
                .apis(RequestHandlerSelectors.basePackage("com.prj.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //配置Swagger信息
    private ApiInfo apiInfo()    {
        return new ApiInfoBuilder()
                // 设置标题
                .title("标题：人事管理系统_接口文档")
                // 描述
                .description("描述：Swagger接口文档")
                // 版本
                .version("版本号: 1.0" )
                .build();
    }
}
