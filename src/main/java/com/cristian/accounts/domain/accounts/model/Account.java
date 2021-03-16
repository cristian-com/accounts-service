package com.cristian.accounts.domain.accounts.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import static com.cristian.accounts.infrastructure.validation.Strings.requiresNonBlank;
import static java.util.Objects.requireNonNull;

@Setter
@Getter
@Builder(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {
  private final String identity;
  @NotNull private EmailAddress email;
  @NotBlank private String name;
  private String surname;
  private PhoneNumber phone;
  private final Set<ContactDetail> contactDetails;

  protected void validate() {
    requireNonNull(email);
    requiresNonBlank(name);
  }

}
