package com.cristian.accounts.application.accounts.service;

import com.cristian.accounts.domain.accounts.model.Account;
import com.cristian.accounts.domain.accounts.repository.AccountRepository;
import com.cristian.accounts.domain.accounts.service.Event;
import com.cristian.accounts.domain.accounts.service.EventService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

  private final AccountRepository accountRepository;
  private final EventService eventService;

  @Override
  public Optional<Account> find(@NotNull final String id) {
    if (Objects.isNull(id)) {
      throw new IllegalArgumentException("The id can not be null");
    }

    if (Strings.isBlank(id)) {
      return Optional.empty();
    }

    return accountRepository.find(id);
  }

  @Override
  public Optional<Account> create(final Account ac) {
    if (Objects.isNull(ac)) {
      throw new IllegalArgumentException("The account can not be null");
    }

    Optional<Account> account = accountRepository.create(ac);
    eventService.publish(new Event());

    return account;
  }

  @Override
  public Account update(Account ac) {
    if (Objects.isNull(ac)) {
      throw new IllegalArgumentException("The account can not be null");
    }

    return null;
  }

  @Override
  public void delete(Account ac) {
    if (Objects.isNull(ac)) {
      throw new IllegalArgumentException("The account can not be null");
    }

    accountRepository.delete(ac);
  }
}
