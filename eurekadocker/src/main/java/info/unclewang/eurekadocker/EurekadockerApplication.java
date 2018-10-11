package info.unclewang.eurekadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekadockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekadockerApplication.class, args);
    }
}
