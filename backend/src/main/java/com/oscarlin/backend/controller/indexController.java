package com.oscarlin.backend.controller;

import com.oscarlin.backend.entity.domain.Function;
import com.oscarlin.backend.service.FunctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    private FunctionServiceImpl functionService;

    @Autowired
    public void autoWired(FunctionServiceImpl functionService) {
        this.functionService = functionService;
    }


    @GetMapping("/test")
    @ResponseBody
    public Map<String, List<Function>> getMenu() {

        return functionService.findAllRemakeMenu();
    }
}
