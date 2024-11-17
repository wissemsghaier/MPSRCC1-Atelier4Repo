package org.mpi.user.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder



public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Génère automatiquement l'ID
    private Long id;// Champ représentant la clé primaire
    private String userName;
    private String password;
}

