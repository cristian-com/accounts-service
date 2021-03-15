package com.cristian.accounts.account.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.StringJoiner;

@Getter
@EqualsAndHashCode(of = "fullAddress")
public class EmailAddress implements ContactDetail {

  private final String username;
  private final String domain;
  private final String fullAddress;

  public EmailAddress(@NotEmpty @Valid String username, @NotEmpty @Valid String domain) {
    this.username = username;
    this.domain = domain;
    this.fullAddress = format(username, domain);
  }

  public static EmailAddress of(@Email @NotEmpty @Valid String fullAddress) {
    String[] values = format(fullAddress);

    return new EmailAddress(values[0], values[1]);
  }

  private static String[] format(String fullAddress) {
    return fullAddress.split("@");
  }

  private String format(String username, String domain) {
    return new StringJoiner("@").add(username).add(domain).toString();
  }

  @Override
  public String getText() {
    return fullAddress;
  }
}
