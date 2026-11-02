package fr.poc.catalogservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

/** Insère quelques produits au démarrage (base H2 en mémoire). */
@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initProducts(ProductRepository repository) {
        return args -> {
            repository.save(new Product("Clavier mécanique", new BigDecimal("89.90"), 25));
            repository.save(new Product("Souris sans fil", new BigDecimal("34.50"), 40));
            repository.save(new Product("Écran 27 pouces", new BigDecimal("249.00"), 10));
        };
    }
}
