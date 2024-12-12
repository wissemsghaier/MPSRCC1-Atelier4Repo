package org.mpi.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.mpi.user.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods can go here
}