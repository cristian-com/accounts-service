package com.cristian.accounts.application.accounts.web.v1;

import com.cristian.accounts.domain.accounts.command.CreateAccountCommand;
import lombok.Data;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Map;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccountsApiRequests {

  CreateAccountCommand createAccountCommand(CreateAccount request);

  @Data
  class CreateAccount implements Serializable {
    @Email private String email;

    @NotBlank private String name;

    private String surname;

    @NumberFormat private String phone;

    private Map<String, String> contactDetails;

    private Map<String, String> customFields;
  }
}
