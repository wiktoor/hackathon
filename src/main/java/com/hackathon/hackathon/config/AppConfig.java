package com.hackathon.hackathon.config;

import com.hackathon.hackathon.model.User;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Server server = new Server();
        server.setUrl("");
        return new OpenAPI().servers(List.of(server));
    }

    @Bean
    List<User> users() {
        return new ArrayList<>();
    }

}
