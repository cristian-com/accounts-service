package com.cristian.accounts.domain.accounts.repository;

import com.cristian.accounts.domain.accounts.model.Account;

import java.util.Optional;

public interface AccountRepository {
  Optional<Account> find(final String id);

  Optional<Account> create(final Account ac);

  Account update(final Account ac);

  void delete(final Account ac);
}
