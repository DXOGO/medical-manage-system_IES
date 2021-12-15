package com.mms.medmanagesystem.services;

import com.mms.medmanagesystem.models.Doenca;
import com.mms.medmanagesystem.repository.DoencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public class DoencaService {
    @Autowired
    private DoencaRepository repository;

    public Doenca saveDoenca(Doenca doenca) {
        return repository.save(doenca);
    }

    public List<Doenca> saveDoencas(List<Doenca> doencas) {
        return repository.saveAll(doencas);
    }

    public List<Doenca> getDoencas() {
        return repository.findAll();
    }

    public Doenca getDoencaByCc(int cc) {
        return repository.findById(cc).orElse(null);
    }

    public Doenca getDoencaByName(String name) {
        return repository.findByName(name);
    }

    public String deleteDoenca(int cc) {
        repository.deleteById(cc);
        return "Doenca removed !! " + cc;
    }

    public Doenca updateDoenca(Doenca Doenca) {
        Doenca existingDoenca = repository.findById(Doenca.getIdDoenca()).orElse(null);
        existingDoenca.setNome(Doenca.getNome());
        existingDoenca.setDescricao(Doenca.getDescricao());
        existingDoenca.setIdDoenca(Doenca.getIdDoenca());
        return repository.save(existingDoenca);
    }
}
