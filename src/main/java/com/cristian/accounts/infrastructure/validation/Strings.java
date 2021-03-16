package com.cristian.accounts.infrastructure.validation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Strings {

  public static void requiresNonBlank(String value) {
    if (StringUtils.isBlank(value)) {
      throw new IllegalArgumentException();
    }
  }
}
