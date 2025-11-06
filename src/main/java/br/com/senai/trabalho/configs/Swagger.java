package br.com.senai.trabalho.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Pizzaria",
        version = "1.0",
        description = "Integrantes: Rafael, João Accácio, Davi D Mello e Ricardo"
    )
)
public class Swagger {

}