package com.oscarlin.backend.controller;

import com.oscarlin.backend.bean.Result;
import com.oscarlin.backend.bean.UserLogin;
import com.oscarlin.backend.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {

    private LoginServiceImpl loginService;

    @Autowired
    public void autoWired(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @PostMapping(value = "/login")
    public Result login(@RequestBody UserLogin userLogin) {


        return loginService.login(userLogin);
    }
}
