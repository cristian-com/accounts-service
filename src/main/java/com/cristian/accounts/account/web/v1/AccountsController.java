package com.cristian.accounts.account.web.v1;

import com.cristian.accounts.account.command.CreateAccountCommand;
import com.cristian.accounts.infrastructure.command.CommandGateway;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@RestController
@RequiredArgsConstructor
public class AccountsController {

  private final CommandGateway commandGateway;

  @PostMapping("/${pablito.clavo}/clavito")
  public ResponseEntity<AccountsApiResponse.AccountCreatedResponse> create(
          @Validated @RequestBody CreateAccount command, BindingResult result,
          @Value("${local.server.port}") String port) {
    System.out.println("Hello World");
    System.out.println("One more my friend");
    commandGateway.send(CreateAccountCommand.builder().build());
    return ResponseEntity.ok(AccountsApiResponse.AccountCreatedResponse.of());
  }

  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  static class CreateAccount implements Serializable {
    public static int serialVersionUID = 2;

    @NotEmpty private String name;
  }
}
