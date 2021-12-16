package com.mms.medmanagesystem.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "pac_vac")
public class Pac_vac {

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_paciente")
    @Id
    private Paciente paciente;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "pac_vac", orphanRemoval = true)
    @JoinColumn(name = "id_vacina")
    private Set<Vacina> vacinas;

    public Pac_vac (){ }

    public Pac_vac(Paciente paciente, Set<Vacina> vacinas) {
        this.paciente = paciente;
        this.vacinas = vacinas;
    }

    public Paciente getpaciente() {
        return this.paciente;
    }

    public void setpaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Set<Vacina> getvacinas() {
        return this.vacinas;
    }

    public void setvacinas(Set<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

}
