package com.pedidos.hco.users.dto;

import com.pedidos.hco.users.constant.ValidationMessages;
import com.pedidos.hco.users.constant.ValidationPatterns;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class RegisterUserRequest {
  private String idCommerce;

  @NotBlank(message = ValidationMessages.NAME_NOT_BLANK_MSG)
  private String name;

  @NotBlank(message = ValidationMessages.LAST_NAME_NOT_BLANK_MSG)
  private String lastName;

  @Pattern(
      regexp = ValidationPatterns.EMAIL_PATTERN,
      message = ValidationMessages.EMAIL_PATTERN_NOT_VALID_MSG
  )
  @NotBlank(message = ValidationMessages.EMAIL_NOT_BLANK_MSG)
  private String email;

  @NotBlank(message = ValidationMessages.USER_NAME_NOT_BLANK_MSG)
  @Size(min = 4, max = 15, message = "Username size must be between 4 and 15.")
  private String userName;

  @Pattern(
      regexp = ValidationPatterns.PHONE_PATTERN,
      message = ValidationMessages.PHONE_PATTERN_NOT_VALID_MSG
  )
  @NotBlank(message = ValidationMessages.PHONE_NOT_BLANK_MSG)
  private String phone;

  @NotBlank(message = ValidationMessages.PASSWORD_NOT_BLANK_MSG)
  private String password;

  @NotBlank(message = ValidationMessages.ADDRESS_NOT_BLANK_MSG)
  private String address;
}
