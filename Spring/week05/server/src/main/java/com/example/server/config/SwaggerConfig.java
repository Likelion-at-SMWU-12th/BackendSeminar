package com.example.server.config;

//import io.swagger.v3.oas.models.OpenAPI;
//import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private final String TITLE = "제목";
    private final String DESCRIPTION = "설명";
    private final String VERSION = "버전";

//    @Bean
//    public OpenAPI api() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title(TITLE)
//                        .description(DESCRIPTION)
//                        .version(VERSION)
//                );
//    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }
}