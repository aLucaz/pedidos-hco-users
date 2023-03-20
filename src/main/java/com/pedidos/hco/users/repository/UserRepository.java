package com.pedidos.hco.users.repository;

import com.pedidos.hco.users.dto.RegisterUserRequest;
import com.pedidos.hco.users.model.User;
import java.util.Optional;

public interface UserRepository {
  User register(RegisterUserRequest user);

  Optional<User> searchByEmail(String email);
}
