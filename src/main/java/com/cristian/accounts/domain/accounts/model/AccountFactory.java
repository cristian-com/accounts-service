package com.cristian.accounts.domain.accounts.model;

import com.cristian.accounts.domain.accounts.command.CreateAccountCommand;
import com.cristian.accounts.infrastructure.validation.Factory;

@Factory
public class AccountFactory implements ModelFactory<Account> {

  public static Account newInstance(CreateAccountCommand command) {
    return Account.builder().build();
  }

  @Override
  public void validate(Account model) {
    model.validate();
  }
}
