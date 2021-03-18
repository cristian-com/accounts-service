package com.cristian.accounts.application.accounts.web.v1;

import com.cristian.accounts.application.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AccountsController {

  private final AccountsApiResponse apiResponse;
  private final AccountsApiRequests apiRequests;
  private final AccountService accountService;

  @PostMapping("/accounts")
  public ResponseEntity<AccountsApiResponse.AccountDetailed> create(
      @Valid @RequestBody AccountsApiRequests.CreateAccount request) {
    var command = apiRequests.createAccountCommand(request);
    var account = accountService.create(command);
    return ResponseEntity.ok(apiResponse.accountDetailed(account));
  }
}
