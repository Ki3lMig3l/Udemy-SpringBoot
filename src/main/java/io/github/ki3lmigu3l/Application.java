package io.github.ki3lmigu3l;

import io.github.ki3lmigu3l.domain.entity.Cliente;
import io.github.ki3lmigu3l.domain.repositorios.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public CommandLineRunner commandLineRunner(@Autowired Clientes clientes){
        return args -> {
            Cliente c = new Cliente ("Fulano");
            clientes.save(c);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
