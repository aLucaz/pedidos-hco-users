package com.pedidos.hco.users.jpa.repository;

import com.pedidos.hco.users.jpa.model.UserJpa;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudUserRepository extends CrudRepository<UserJpa, String> {
  Optional<UserJpa> findByEmail(String email);
}
