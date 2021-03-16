package com.cristian.accounts.domain.accounts.model;

public interface ModelFactory<T> {
  void validate(T model) throws Exception;

  default void validate(T model, Runnable callable) throws Exception {
   validate(model);
   callable.run();
  }
}
