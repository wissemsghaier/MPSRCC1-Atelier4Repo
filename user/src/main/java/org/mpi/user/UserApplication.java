package org.mpi.user;

import org.mpi.user.model.UserEntity;
import java.util.List; // Utilisé pour gérer des collections
import org.springframework.beans.factory.annotation.Autowired;
import org.mpi.user.repository.UserRepository; // Référentiel
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
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            List<UserEntity> users = List.of(
                UserEntity.builder()
                    .id(1L) // Laissez null si l'ID est généré automatiquement
                    .userName("Med")
                    .password("pwd")
                    .build(),
                UserEntity.builder()
                    .id(2L) // Laissez null si l'ID est généré automatiquement
                    .userName("Mariem")
                    .password("pwd")
                    .build()
            );
            userRepository.saveAll(users);
        };
    }
}




// @SpringBootApplication
// public class UserApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(UserApplication.class, args);
//     }

//     @Bean
//     CommandLineRunner commandLineRunner() {
//         return args -> {
//             // Créer un utilisateur
//             User user = User.builder()
//                     .id(1L) // Tu peux laisser l'id null si tu ne veux pas le définir manuellement
//                     .userName("fss")
//                     .password("pwd")
//                     .build();

//             // Afficher les détails de l'utilisateur
//             System.out.println("User created: " + user);
//         };
//     }

// }