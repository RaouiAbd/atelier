package emi.iql.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//test
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
    
    public void abde(String name) {}

}
