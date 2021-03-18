package com.cristian.accounts.domain.accounts.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomField {
  @NotNull private final String name;
  private final FieldType fieldType;
}
