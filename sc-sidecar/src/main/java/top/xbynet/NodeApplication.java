package top.xbynet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author taojiawei
 * @create 2017/12/23
 **/
@SpringBootApplication
@EnableSidecar
public class NodeApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(NodeApplication.class).web(true).run(args);
	}
}
