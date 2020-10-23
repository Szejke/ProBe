package com.engine.engine.service;

import com.engine.engine.model.Expense;
import com.engine.engine.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public List<Expense> getExpanses(){
        return expenseRepository.findAll();
    }
}
