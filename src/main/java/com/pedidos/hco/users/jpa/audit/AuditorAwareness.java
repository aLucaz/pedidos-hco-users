package com.pedidos.hco.users.jpa.audit;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareness implements AuditorAware<String> {
  @Override
  public Optional<String> getCurrentAuditor() {
    return Optional.of("fc4041f6-6763-4645-b681-e5998e3bebea");
  }
}
