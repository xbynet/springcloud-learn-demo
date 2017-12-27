package top.xbynet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author taojiawei
 * @create 2017/12/23
 **/
@SpringBootApplication
@EnableDiscoveryClient
//@EnableTurbineStream
@EnableHystrixDashboard
@EnableTurbine
public class HystrixDashApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixDashApplication.class).run(args);
	}
}
