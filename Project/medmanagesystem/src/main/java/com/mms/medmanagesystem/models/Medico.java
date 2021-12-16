package com.mms.medmanagesystem.models;

import lombok.Data;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    @JoinColumn(name = "medico_cc", referencedColumnName = "pessoa_cc") //referenccedColumName é o que vem de pessoa
    private Pessoa medico_cc;
    
    private String password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_area")
    private Area area;
    
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "id", orphanRemoval = true)
    private Set<Consulta> consultas;
    
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "id", orphanRemoval = true)
    private Set<Paciente> pacientes;

    
    

    public Medico(int id, Pessoa pessoa_cc, Area area, String password) {
        this.id = id;
        this.medico_cc = pessoa_cc;
        this.area = area;
        this.password = password;
    }

    @Column(name = "id_medico")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getCc() {
        return this.medico_cc;
    }

    public void setCc(Pessoa pessoa_cc) {
        this.medico_cc = pessoa_cc;
    }

    public Area getArea() {
        return this.area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Column(name = "password")
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}