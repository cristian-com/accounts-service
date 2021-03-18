package com.cristian.accounts.application.accounts.service;

import com.cristian.accounts.domain.accounts.command.CreateAccountCommand;
import com.cristian.accounts.domain.accounts.model.Account;

import java.util.Optional;

public interface AccountService {
  Optional<Account> find(final String id);

  Account create(final CreateAccountCommand ac);

  Account update(final Account ac);

  void delete(final Account ac);
}
