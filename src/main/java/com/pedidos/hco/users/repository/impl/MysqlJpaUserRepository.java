package com.pedidos.hco.users.repository.impl;

import com.pedidos.hco.users.dto.RegisterUserRequest;
import com.pedidos.hco.users.helper.IdHelper;
import com.pedidos.hco.users.jpa.model.UserJpa;
import com.pedidos.hco.users.jpa.repository.CrudUserRepository;
import com.pedidos.hco.users.model.User;
import com.pedidos.hco.users.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class MysqlJpaUserRepository implements UserRepository {
  private final CrudUserRepository crudUserRepository;

  public MysqlJpaUserRepository(CrudUserRepository crudUserRepository) {
    this.crudUserRepository = crudUserRepository;
  }

  @Override
  public User register(RegisterUserRequest request) {
    var user = UserJpa.fromRequest(request);
    user.setId(IdHelper.generateUuid());
    var registeredUser = this.crudUserRepository.save(user);
    return registeredUser.toModel();
  }

  @Override
  public Optional<User> searchByEmail(String email) {
    var usersOpt = this.crudUserRepository.findByEmail(email);
    if (usersOpt.isPresent()) {
      var userJpa = usersOpt.get();
      var user = userJpa.toModel();
      return Optional.of(user);
    }
    return Optional.empty();
  }
}
