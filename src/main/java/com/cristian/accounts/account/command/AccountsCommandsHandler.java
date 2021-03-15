package com.cristian.accounts.account.command;

import com.cristian.accounts.account.model.Account;
import com.cristian.accounts.account.service.AccountService;
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
      accountService.create(new Account());
    }

    return null;
  }
}
