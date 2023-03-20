package com.pedidos.hco.users.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
  private String id;
  private String name;
  private String lastName;
  private String email;
  private String userName;
  private String phone;
  private String password;
  private String address;
}
