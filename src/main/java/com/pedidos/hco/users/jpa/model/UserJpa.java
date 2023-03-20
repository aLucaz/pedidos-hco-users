package com.pedidos.hco.users.jpa.model;

import com.pedidos.hco.users.dto.RegisterUserRequest;
import com.pedidos.hco.users.jpa.audit.Auditable;
import com.pedidos.hco.users.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "pedidos-hco-users-db")
public class UserJpa extends Auditable<String> {
  @Id
  @Column(name = "id")
  private String id;
  @Column(name = "name")
  private String name;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "email")
  private String email;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "phone")
  private String phone;
  @Column(name = "password")
  private String password;
  @Column(name = "address")
  private String address;
  @OneToMany(mappedBy = "user")
  private List<UserCommerceJpa> userCommerces;

  public static UserJpa fromRequest(RegisterUserRequest request) {
    return UserJpa.builder()
      .name(request.getName())
      .lastName(request.getLastName())
      .email(request.getEmail())
      .userName(request.getUserName())
      .phone(request.getPhone())
      .password(request.getPassword())
      .address(request.getAddress())
      .build();
  }

  public User toModel() {
    return User.builder()
      .id(this.id)
      .name(this.name)
      .lastName(this.lastName)
      .email(this.email)
      .userName(this.userName)
      .phone(this.phone)
      .password(this.password)
      .address(this.address)
      .build();
  }
}
