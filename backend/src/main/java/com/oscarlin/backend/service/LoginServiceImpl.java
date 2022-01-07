package com.oscarlin.backend.service;

import com.oscarlin.backend.bean.Result;
import com.oscarlin.backend.bean.UserLogin;
import com.oscarlin.backend.entity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private AccountRepository accountRepository;

    @Autowired
    public void autoWired(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public Result login(UserLogin userLogin) {
        return null;
    }
}
