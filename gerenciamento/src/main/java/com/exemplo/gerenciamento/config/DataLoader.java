package com.exemplo.gerenciamento.config;

import com.exemplo.gerenciamento.entities.Categoria;
import com.exemplo.gerenciamento.repositories.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(CategoriaRepository repository) {
        return args -> {
            Categoria c1 = new Categoria();
            c1.setNome("Eletrônicos");
            repository.save(c1);
        };
    }
}