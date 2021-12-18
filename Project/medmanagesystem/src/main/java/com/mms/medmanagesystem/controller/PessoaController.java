package com.mms.medmanagesystem.controller;
import java.util.*;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.medmanagesystem.exception.*;
import com.mms.medmanagesystem.model.Pessoa;
import com.mms.medmanagesystem.service.PessoaService;

@RestController
@RequestMapping("/api/v6")
public class PessoaController {

    @Autowired
    private PessoaService service;
    
     @GetMapping("/pessoas")
    public List<Pessoa> getAllPeople() {
        return service.getPessoas();
    }

   
    @GetMapping("/pessoas/{id}")
    public Pessoa getPessoaByCC(@PathVariable(value="id") int pessoa_cc) throws ResourceNotFoundException {
        return service.getPessoaByCc(pessoa_cc);
    }
        
    
    @PostMapping("/pessoas")
    public Pessoa createPessoa(@Valid @RequestBody Pessoa pessoa){
        return service.savePessoa(pessoa);
    }

  
    @PutMapping("/pessoas/{id}")
    public Pessoa updatePessoa(@PathVariable("id") int id, @Valid @RequestBody Pessoa pessoa) throws ResourceNotFoundException {
       return service.updatePessoa(id, pessoa);
    }

    @DeleteMapping("/pessoas/{id}")
    public Map<String, Boolean> deletePeople(@PathVariable int cc) throws ResourceNotFoundException {
        return service.deletePessoa(cc);
    }



}
