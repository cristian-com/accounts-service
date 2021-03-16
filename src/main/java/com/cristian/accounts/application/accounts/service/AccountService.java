package com.cristian.accounts.application.accounts.service;

import com.cristian.accounts.domain.accounts.model.Account;

import java.util.Optional;

public interface AccountService {
  Optional<Account> find(final String id);

  Optional<Account> create(final Account ac);

  Account update(final Account ac);

  void delete(final Account ac);
}
