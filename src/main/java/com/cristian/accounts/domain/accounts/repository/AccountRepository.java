package com.cristian.accounts.domain.accounts.repository;

import com.cristian.accounts.domain.accounts.model.Account;

import java.util.Optional;

public interface AccountRepository {
  Optional<Account> find(final String id);

  Account save(final Account ac);

  void delete(final Account ac);
}
