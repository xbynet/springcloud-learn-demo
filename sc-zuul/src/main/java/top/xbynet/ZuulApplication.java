package top.xbynet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author taojiawei
 * @create 2017/12/23
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).run(args);
	}
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
