// package org.mpi.user.controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class UserController {
//     @GetMapping("/hello")
//     public String sayHello() {
//         return "Hello MPI1";
//     }
// }






package org.mpi.user.controller;

import org.mpi.user.model.UserEntity;
import org.mpi.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    // Constructeur pour l'injection du dépôt
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Endpoint pour afficher un message de bienvenue
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello MPI1";
    }

    // Endpoint pour récupérer la liste de tous les utilisateurs
    @GetMapping("/users")
    public List<UserEntity> getUsersList() {
        return userRepository.findAll(); // Retourne tous les utilisateurs
    }

    // Endpoint pour récupérer un utilisateur spécifique par son ID
    @GetMapping("/users/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null); // Retourne l'utilisateur ou null si non trouvé
    }
}
