package com.pedidos.hco.users.jpa.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_commerce", schema = "pedidos-hco-users-db")
public class UserCommerceJpa {
  @Id
  private String id;
  @ManyToOne
  @JoinColumn(name = "id_user")
  private UserJpa user;
  @ManyToOne
  @JoinColumn(name = "id_commerce")
  private CommerceJpa commerce;
  @Column(name = "position")
  private String position;
}
