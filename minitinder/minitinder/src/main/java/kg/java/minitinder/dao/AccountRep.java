package kg.java.minitinder.dao;

import kg.java.minitinder.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRep extends JpaRepository<Account,Long> {
}
