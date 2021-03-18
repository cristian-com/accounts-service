package com.cristian.accounts.application.accounts.service;

import com.cristian.accounts.domain.accounts.command.CreateAccountCommand;
import com.cristian.accounts.domain.accounts.model.Account;
import com.cristian.accounts.domain.accounts.model.AccountFactory;
import com.cristian.accounts.domain.accounts.repository.AccountRepository;
import com.cristian.accounts.domain.accounts.service.Event;
import com.cristian.accounts.domain.accounts.service.EventService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

  private final AccountFactory accountFactory;
  private final AccountRepository accountRepository;
  private final EventService eventService;

  @Override
  public Optional<Account> find(@NotNull final String id) {
    requireNonNull(id);

    if (Strings.isBlank(id)) {
      return Optional.empty();
    }

    return accountRepository.find(id);
  }

  @Override
  public Account create(@NotNull final CreateAccountCommand command) {
    requireNonNull(command);
    var account = AccountFactory.newInstance(command);
    eventService.publish(new Event());
    return accountRepository.save(account);
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
