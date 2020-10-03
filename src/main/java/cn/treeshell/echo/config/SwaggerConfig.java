package cn.treeshell.echo.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * Swagger配置
 *
 * @author panjing
 */
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.treeshell.echo"))
                .paths(PathSelectors.any())
                .build()
                .forCodeGeneration(true)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "echo-Swagger",
                "echo's interface documentation.",
                "1.0",
                "Terms of service",
                new Contact("treeshell", "https://www.treeshell.cn", "iopanjing@gmail.com"),
                "All rights are reserved",
                "https://www.treeshell.cn",
                Collections.emptyList());
    }

}
