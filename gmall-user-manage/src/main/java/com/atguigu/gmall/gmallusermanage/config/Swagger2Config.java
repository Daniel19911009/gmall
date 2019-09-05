package com.atguigu.gmall.gmallusermanage.config;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Daniel
 * @create 2019--08--15--22:38
 * @Description:
 */
@SpringBootConfiguration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
//                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }
    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("用户管理模块")
                .description("本文档描述了讲师管理中心微服务接口定义")
                .version("1.0")
                .contact(new Contact("Jack", "http://atguigu.com", "55317332@qq.com"))
                .build();
    }

}
