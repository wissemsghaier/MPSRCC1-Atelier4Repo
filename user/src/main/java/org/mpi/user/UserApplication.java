package org.mpi.user;

import org.mpi.user.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            // Créer un utilisateur
            User user = User.builder()
                    .id(1L) // Tu peux laisser l'id null si tu ne veux pas le définir manuellement
                    .userName("fss")
                    .password("pwd")
                    .build();

            // Afficher les détails de l'utilisateur
            System.out.println("User created: " + user);
        };
    }

}
