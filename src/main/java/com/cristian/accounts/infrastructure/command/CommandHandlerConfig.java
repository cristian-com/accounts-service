package com.cristian.accounts.infrastructure.command;

import com.cristian.accounts.domain.accounts.command.CreateAccountCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class CommandHandlerConfig implements InitializingBean {

  private final Map<String, CommandHandler> handlers;
  private final CommandDispatcher commandDispatcher;

  @Override
  public void afterPropertiesSet() throws Exception {
        commandDispatcher.register(CreateAccountCommand.class, handlers.get("accountsCommandsHandler"));
  }
}
