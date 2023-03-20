package com.pedidos.hco.users.service;

import com.pedidos.hco.users.dto.RegisterUserRequest;
import com.pedidos.hco.users.model.User;
import com.pedidos.hco.users.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {
  private final UserRepository userRepository;

  public RegisterUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User execute(RegisterUserRequest request) {
    if (userRepository.searchByEmail(request.getEmail()).isPresent()) {
      throw new RuntimeException("AAAAAAAAA");
    }
    return userRepository.register(request);
  }
}
