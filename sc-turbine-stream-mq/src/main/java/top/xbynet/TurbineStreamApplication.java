package top.xbynet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @author taojiawei
 * @create 2017/12/24
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
public class TurbineStreamApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(TurbineStreamApplication.class).run(args);
	}
}
