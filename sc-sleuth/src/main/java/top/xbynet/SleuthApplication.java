package top.xbynet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @author taojiawei
 * @create 2017/12/23
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class SleuthApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SleuthApplication.class).run(args);
	}
}
