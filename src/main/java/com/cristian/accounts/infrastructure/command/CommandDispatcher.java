package com.cristian.accounts.infrastructure.command;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Service
public class CommandDispatcher {

  private final Map<Class<? extends Command>, CommandHandler> handlers = new HashMap<>();

  public void register(Class<? extends Command> command, CommandHandler handler) {
    CommandHandler previousItem = handlers.putIfAbsent(command, handler);
    if (Objects.nonNull(previousItem)) {
      throw new IllegalArgumentException("");
    }
  }

  public Optional<CommandHandler> revoke(Class<? extends Command> command) {
    return Optional.ofNullable(handlers.remove(command));
  }

  public void execute(final Command command) {
    if (Objects.isNull(command)) {
      throw new IllegalArgumentException("");
    }

    CommandHandler handler = handlers.get(command.getClass());
    if (Objects.isNull(handler)) {
      System.out.println("Not handler found!");
      return;
    }

    handler.handle(command);
  }
}
