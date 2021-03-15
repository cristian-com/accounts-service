package com.cristian.accounts.account.model;

import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class Account {
  private String identity;
  private EmailAddress email;
  private String name;
  private String surname;
  private PhoneNumber phone;
  private Set<ContactDetail> contactDetails;
  private Map<String, String> customFields;
}
