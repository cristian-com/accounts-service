package com.cristian.accounts.domain.accounts.model;

import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class CustomField {
  @NotNull private final String name;
  private final FieldType fieldType;
}
