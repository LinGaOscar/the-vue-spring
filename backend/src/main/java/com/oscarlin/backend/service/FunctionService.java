package com.oscarlin.backend.service;

import com.oscarlin.backend.entity.domain.Function;

import java.util.List;
import java.util.Map;

public interface FunctionService {
    Function saveFunction(Function function);
    Function upDateFunction(Function function);
    List<Function> findAll();

    Map<String, List<Function>> findAllRemakeMenu();
}
