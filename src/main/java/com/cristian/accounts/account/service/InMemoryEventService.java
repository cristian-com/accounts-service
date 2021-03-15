package com.cristian.accounts.account.service;

public class InMemoryEventService implements EventService {

  @Override
  public void publish(Event event) {
    System.out.println("Hello ----------------- World");
  }
}
