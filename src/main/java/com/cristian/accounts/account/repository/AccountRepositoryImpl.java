package com.cristian.accounts.account.repository;

import com.cristian.accounts.account.model.Account;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

  //private final AccountDao accountDao;

  @Override
  public Optional<Account> find(String id) {
    return Optional.empty();
  }

  @Override
  public Optional<Account> create(Account ac) {
    return Optional.empty();
  }

  @Override
  public Account update(Account ac) {
    return null;
  }

  @Override
  public void delete(Account ac) {}

  //@Repository
  public interface AccountDao extends JpaRepository<Account, String> {}
}
