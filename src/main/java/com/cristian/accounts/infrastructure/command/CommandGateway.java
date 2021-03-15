package com.cristian.accounts.infrastructure.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class CommandGateway {

  private final CommandDispatcher commandDispatcher;

  public void send(final Command command) {
    commandDispatcher.execute(command);
  }

  public CompletableFuture<Void> sendAsync(final Command command) {
    return CompletableFuture.runAsync(() -> commandDispatcher.execute(command));
  }
}
