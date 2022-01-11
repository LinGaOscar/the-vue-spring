package com.oscarlin.backend.controller;

import com.oscarlin.backend.entity.domain.Function;
import com.oscarlin.backend.entity.domain.User;
import com.oscarlin.backend.service.FunctionServiceImpl;
import com.oscarlin.backend.service.UserService;
import com.oscarlin.backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private FunctionServiceImpl functionService;

    private UserServiceImpl userService;

    @Autowired
    public void autoWired(FunctionServiceImpl functionService ,UserServiceImpl userService) {
        this.functionService = functionService;
        this.userService =userService;
    }

    @GetMapping("/getSider")
    @ResponseBody
    public Map<String, List<Function>> getMenu() {
        return functionService.findAllRemakeMenu();
    }

    @GetMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.findAll();
    }
}
