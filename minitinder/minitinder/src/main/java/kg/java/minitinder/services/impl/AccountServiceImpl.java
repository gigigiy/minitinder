package kg.java.minitinder.services.impl;

import kg.java.minitinder.models.Account;
import kg.java.minitinder.models.dto.AccountRep;
import kg.java.minitinder.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRep rep;
    @Override
    public Account save(Account account) {
        return rep.save(account);
    }

    @Override
    public Account findById(Long id) {
        return null;
    }
}
