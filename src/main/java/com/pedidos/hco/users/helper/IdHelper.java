package com.pedidos.hco.users.helper;

import com.fasterxml.uuid.Generators;

public class IdHelper {
  public static String generateUuid() {
    return Generators.randomBasedGenerator().generate().toString();
  }

  private IdHelper() {
  }
}
