package com.engine.engine.service;

import com.engine.engine.model.DanePerson;
import com.engine.engine.model.Expense;
import com.engine.engine.repository.DanePersonRepository;
import com.engine.engine.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DanePersonService {

    private final DanePersonRepository danePersonRepository;

    public List<DanePerson> getDanePersons(){
        return danePersonRepository.findAll();
    }

    public DanePerson insertDanePerson(DanePerson danePerson){
        return danePersonRepository.save(danePerson);
    }

    public void deleteDanePerson(Long id){
        danePersonRepository.deleteById(id);
    }

    public DanePerson editDanePerson(DanePerson danePerson){
        return danePersonRepository.save(danePerson);
    }
}
