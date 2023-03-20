package com.pedidos.hco.users.jpa.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<T> {
  @CreatedBy
  @Column(name = "created_by")
  protected T createdBy;

  @CreatedDate
//  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  @Column(name = "created_at")
  @Temporal(TemporalType.TIMESTAMP)
  protected LocalDateTime createdAt;

  @LastModifiedBy
  @Column(name = "updated_by")
  protected T updatedBy;

  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at")
  protected LocalDateTime updatedAt;

  @PrePersist
  public void onCreate() {
    this.createdAt = LocalDateTime.now(ZoneId.of("UTC"));
    this.updatedAt = LocalDateTime.now(ZoneId.of("UTC"));
  }

  @PreUpdate
  public void onUpdate() {
    this.updatedAt = LocalDateTime.now(ZoneId.of("UTC"));
  }
}
