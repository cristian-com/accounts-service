package com.cristian.accounts.infrastructure.command;

public interface CommandHandler {
    Command handle(Command command);
}
