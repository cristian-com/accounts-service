package com.cristian.accounts.domain.accounts.command;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Setter
@NoArgsConstructor
public class CreateAccountCommand {
  private String name;
  private String email;
  private String surname;
  private String phone;
  private Map<String, String> contactDetails;
}
