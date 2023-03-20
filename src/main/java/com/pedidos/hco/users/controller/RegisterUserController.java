package com.pedidos.hco.users.controller;

import com.pedidos.hco.users.constant.Api;
import com.pedidos.hco.users.dto.RegisterUserRequest;
import com.pedidos.hco.users.service.RegisterUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(path = Api.REGISTER_USER_API_BASE_PATH)
public class RegisterUserController {
  private final RegisterUserService registerUserService;

  public RegisterUserController(RegisterUserService registerUserService) {
    this.registerUserService = registerUserService;
  }

  @PostMapping(
    path = Api.REGISTER_USER_SERVICE,
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<Object> register(@RequestBody RegisterUserRequest request) {
    var user = this.registerUserService.execute(request);
    return new ResponseEntity<>(user, HttpStatus.CREATED);
  }
}
