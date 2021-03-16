package com.cristian.accounts.domain.accounts.command;

import com.cristian.accounts.application.accounts.service.AccountService;
import com.cristian.accounts.domain.accounts.model.AccountFactory;
import com.cristian.accounts.infrastructure.command.Command;
import com.cristian.accounts.infrastructure.command.CommandHandler;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountsCommandsHandler implements CommandHandler {

  private final AccountService accountService;

  @Override
  public Command handle(@NotNull Command command) {
    if (CreateAccountCommand.class.isAssignableFrom(command.getClass())) {
      accountService.create(AccountFactory.newInstance());
    }

    return null;
  }
}
