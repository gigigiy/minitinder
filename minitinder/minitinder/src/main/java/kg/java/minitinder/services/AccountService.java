package kg.java.minitinder.services;

import kg.java.minitinder.models.Account;

public interface AccountService {
    Account save(Account account);
    Account findById(Long id);
}
