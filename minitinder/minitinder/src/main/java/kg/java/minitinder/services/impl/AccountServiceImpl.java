package kg.java.minitinder.services.impl;

import kg.java.minitinder.models.Account;
import kg.java.minitinder.dao.AccountRep;
import kg.java.minitinder.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

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

    @Override
    public Account create(String login) {
        Account account = new Account();
        account.setLogin(login);
        account.setPassword(generatePassword());
        account=save(account);
        return account;
    }

    private String generatePassword() {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int PASSWORD_LENGTH = 6;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            password.append(randomChar);
        }
        return  null;
    }
}
