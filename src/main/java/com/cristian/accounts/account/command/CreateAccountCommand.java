package com.cristian.accounts.account.command;

import com.cristian.accounts.infrastructure.command.Command;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Configurable;

@Builder
@Configurable
public class CreateAccountCommand implements Command {

  private static final String COMMAND_ID = "CreateAccount";
  private final String name;
}
