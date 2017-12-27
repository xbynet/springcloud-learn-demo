package top.xbynet;

import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

/**
 * @author taojiawei
 * @create 2017/12/22
 **/
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class ServiceA1Application {
	@Bean
	public Docket docket() {
		ApiSelectorBuilder apiSelectorBuilder = new Docket(DocumentationType.SWAGGER_2).select();
		apiSelectorBuilder.apis(withClassAnnotation(Api.class));
		return apiSelectorBuilder
				.build()
				.pathMapping("/")
//				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo());
//				.forCodeGeneration(true);
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("RESTful APIs").contact(new Contact("","",""))
				.version("1.0")
				.build();
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceA1Application.class).web(true).run(args);
	}
}
