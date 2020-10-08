package cn.treeshell.echo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置
 *
 * @author panjing
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket api(Environment environment) {
        // 设置Swagger显示的环境
        Profiles profiles = Profiles.of("dev");
        // 判断当前是否处于dev环境
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.treeshell.echo.controller"))
                .paths(PathSelectors.any())
                .build()
                .forCodeGeneration(true)
                .apiInfo(apiInfo())
                .enable(flag)
                .groupName("echo");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("echo-swagger")
                .description("echo's interface documentation.")
                .contact(new Contact("panjing", "https://www.treeshell.cn", "iopanjing@gmail.com"))
                .version("1.0")
                .build();
    }

}
