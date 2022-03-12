package com.chilton.swagger;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class Swagger_Config {
	
	/*
	 * @Bean public GroupedOpenApi publicApi() { return GroupedOpenApi.builder()
	 * .group("com.chilton") .pathsToMatch("/**") .build(); }
	 */
	  @Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Chilton API")
	              .description(" chilton vehicle application")
	              .version("v0.0.1")
	              .license(new License().name("chilton v 2.0").url("https://localhost:8081/swagger-ui/index.html")))
	              .externalDocs(new ExternalDocumentation()
	              .description("SpringShop Wiki Documentation")
	              .url("https://springdoc.org/migrating-from-springfox.html"));
	  }


}
