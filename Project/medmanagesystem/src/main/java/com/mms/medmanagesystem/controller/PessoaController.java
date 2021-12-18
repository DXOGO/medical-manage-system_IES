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
@RequestMapping("/api/v1")
public class PessoaController {

    @Autowired
    private PessoaService service;
    
     @GetMapping("/pessoas")
    public List<Pessoa> getAllPeople() {
        return service.getPessoas();
    }

   
    @GetMapping("/pessoas/{id}")
    public Pessoa getPessoaByCC(@PathVariable(value="id") int pessoa_cc) {
        Pessoa pessoa = service.getPessoaByCc(pessoa_cc);
            /*
            throws ResourceNotFoundException {
                Pessoa pessoa = service.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Nenhuma pessoa encontrada com este nº de CC : " + pessoa_cc));
                return ResponseEntity.ok().body(employee);
            } this is not working :(
        */
        return pessoa; 
    }
        
    
    @PostMapping("/pessoas")
    public Pessoa createPessoa(@Valid @RequestBody Pessoa pessoa){
        return service.savePessoa(pessoa);
    }

  
    @PutMapping("/pessoas/{id}")
    public Pessoa updatePessoa(@PathVariable("id") @RequestBody Pessoa pessoa) {
        //tentar trabalhar com exceptions
       return service.updatePessoa(pessoa);
    }
        /*
         @Valid @RequestBody Pessoa pessoaDetails)  {
        Pessoa pessoa = service.getPessoaByCc(pessoa_cc);
        //.orElseThrow(() -> new ResourceNotFoundException("Nenhuma pessoa encontrada com este CC " + pessoa_cc)); not working 
        service.updatePessoa(pessoa);*/

    @DeleteMapping("/pessoas/{id}")
    public String deletePeople(@PathVariable int cc) {
        return service.deletePessoa(cc);
    }



}
