package com.oscarlin.backend.entity.service;

import com.oscarlin.backend.entity.domain.Function;
import com.oscarlin.backend.entity.repository.FunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FunctionServiceImpl implements FunctionService {

    private FunctionRepository functionRepository;

    @Autowired
    public void autoWired(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }


    @Override
    public Function saveFunction(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public Function upDateFunction(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public List<Function> findAll() {
        return functionRepository.findAll();
    }

    @Override
    public Map<String,  List<Function>> findAllMap() {
        return functionRepository.findAllMap();
    }
}
