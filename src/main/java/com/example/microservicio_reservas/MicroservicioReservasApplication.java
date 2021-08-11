package com.example.microservicio_reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"dao"})
@ComponentScan(basePackages = {"controller", "dao", "service"})
@SpringBootApplication
public class MicroservicioReservasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicioReservasApplication.class, args);
    }

    /* Activa la libreria Ribbon para acceder al servicio utilizando eureka*/
    @LoadBalanced
    @Bean
    public RestTemplate crearTemplate() {
        return new RestTemplate();
    }

}
