package com.v.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableWebMvc
public class SwaggerConfiguration {
	
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.v")) // Replace with your package name
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(apiInfo())
	                .useDefaultResponseMessages(false); // Disable default responses
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Product Management App")
	                .description("Simple Application Which Describes how to use swagger in application")
	                .version("1.0.0")
	                .contact(new Contact("Rohit Thakur", "ThakurRohitDSingh@Gmail.Com", "9673428105"))
	                .build();
	    }	    
}