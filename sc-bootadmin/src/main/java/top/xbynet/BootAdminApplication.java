package top.xbynet;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taojiawei
 * @create 2017/12/23
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class BootAdminApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(BootAdminApplication.class).run(args);
//		SpringApplication.run(BootAdminApplication.class,args);
	}
}
