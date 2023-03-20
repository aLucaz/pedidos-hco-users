package com.pedidos.hco.users.constant;

public class ValidationMessages {

  public static final String NOT_BLANK_MSG = "must not be null and must contain at least "
      + "one non-whitespace character.";
  public static final String NAME_NOT_BLANK_MSG = "name " + NOT_BLANK_MSG;
  public static final String LAST_NAME_NOT_BLANK_MSG = "lastname " + NOT_BLANK_MSG;
  public static final String EMAIL_NOT_BLANK_MSG = "email " + NOT_BLANK_MSG;
  public static final String USER_NAME_NOT_BLANK_MSG = "username " + NOT_BLANK_MSG;
  public static final String PHONE_NOT_BLANK_MSG = "phone " + NOT_BLANK_MSG;
  public static final String PASSWORD_NOT_BLANK_MSG = "password " + NOT_BLANK_MSG;
  public static final String ADDRESS_NOT_BLANK_MSG = "address " + NOT_BLANK_MSG;

  public static final String PATTERN_NOT_VALID_MSG = "pattern is not valid";
  public static final String EMAIL_PATTERN_NOT_VALID_MSG = "email " + PATTERN_NOT_VALID_MSG;
  public static final String PHONE_PATTERN_NOT_VALID_MSG = "phone " + PATTERN_NOT_VALID_MSG;

  private ValidationMessages() {
  }
}
