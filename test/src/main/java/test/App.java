package test;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class App 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(App.class).run(args);
    }
}
