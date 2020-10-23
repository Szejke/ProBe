package com.engine.engine.controller;


import com.engine.engine.model.DanePerson;
import com.engine.engine.model.Expense;
import com.engine.engine.service.DanePersonService;
import com.engine.engine.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;


    @GetMapping("/expense")
    public List<Expense> getExpense(){
        return expenseService.getExpanses();
    }

    @GetMapping("/tak")
    public String getTak(){
        return "tak";
    }




}
