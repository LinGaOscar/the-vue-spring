package com.oscarlin.backend.service;

import com.oscarlin.backend.bean.Result;
import com.oscarlin.backend.bean.UserLogin;

public interface LoginService {

    public Result login(UserLogin userLogin);
}
