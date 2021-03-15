package com.cristian.accounts.account.web.v1;

import com.cristian.accounts.account.model.ContactDetail;
import com.cristian.accounts.infrastructure.web.ApiResponse;
import lombok.Getter;

import java.util.Map;
import java.util.Set;

public interface AccountsApiResponse {

  @Getter
  class AccountDetailed {
    private String identity;
    private String email;
    private String name;
    private String surname;
    private String phone;
    private Set<ContactDetail> contactDetails;
    private Map<String, String> customFields;
  }

  class AccountCreatedResponse extends ApiResponse<AccountDetailed> {
    public static final String MESSAGE = "accounts.create.success";

    public AccountCreatedResponse(String message, AccountDetailed content) {
      super(message, content);
    }

    public static AccountCreatedResponse of() {
      return new AccountCreatedResponse(MESSAGE, new AccountDetailed());
    }
  }

}
