package info.unclewang.eurekamultiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMultiserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMultiserverApplication.class, args);
    }
}
