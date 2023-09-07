package net.yorksolutions.storespringboot.Repositories;

import net.yorksolutions.storespringboot.Entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Optional<Account> findByUsernameAndPassword(String username,String password);
}
