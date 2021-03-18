package com.cristian.accounts.application.accounts.web.v1;

import com.cristian.accounts.domain.accounts.model.Account;
import com.cristian.accounts.domain.accounts.model.ContactDetail;
import com.cristian.accounts.domain.accounts.model.EmailAddress;
import com.cristian.accounts.domain.accounts.model.PhoneNumber;
import lombok.Data;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccountsApiResponse {

  AccountDetailed accountDetailed(Account account);

  default String email(EmailAddress email) {
    if (Objects.isNull(email)) {
      return null;
    }

    return email.getText();
  }

  default String email(PhoneNumber phone) {
    if (Objects.isNull(phone)) {
      return null;
    }

    return phone.getText();
  }

  @Data
  class AccountDetailed {
    private String identity;
    private String email;
    private String name;
    private String surname;
    private String phone;
    private Set<ContactDetail> contactDetails;
    private Map<String, String> customFields;
  }
}
