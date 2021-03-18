package com.cristian.accounts.domain.accounts.repository;

import com.cristian.accounts.domain.accounts.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

  // private final AccountDao accountDao;

  @Override
  public Optional<Account> find(String id) {
    return Optional.empty();
  }

  @Override
  public Account save(Account ac) {
    return null;
  }

  @Override
  public void delete(Account ac) {}

  // @Repository
  public interface AccountDao extends JpaRepository<Account, String> {}
}
