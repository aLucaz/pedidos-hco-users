package com.pedidos.hco.users.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "commerce", schema = "pedidos-hco-users-db")
public class CommerceJpa {
  @Id
  private String id;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;
  @Column(name = "address")
  private String address;
  @Column(name = "enabled")
  private Boolean enabled;
  @OneToMany(mappedBy = "commerce")
  private List<UserCommerceJpa> userCommerces;
}
