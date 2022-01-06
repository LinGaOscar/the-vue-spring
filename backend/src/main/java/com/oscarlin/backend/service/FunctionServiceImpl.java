package com.oscarlin.backend.service;

import com.oscarlin.backend.entity.domain.Function;
import com.oscarlin.backend.entity.repository.FunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public Map<String,  List<Function>> findAllRemakeMenu() {
        Map<String, List<Function>> formats =  findAll().stream()
                .sorted(Comparator.comparing(Function::getSortNo))
                .collect(Collectors.groupingBy(Function::getUpLevel));

        return formats;
    }
}
