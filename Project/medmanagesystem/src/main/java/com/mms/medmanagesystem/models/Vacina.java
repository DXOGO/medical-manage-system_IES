package com.mms.medmanagesystem.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vacina")
public class Vacina {

    @Id
    @GeneratedValue
    private int id;

    private String nome;
    private String patologia;


	//public Vacina () {}

	@ManyToOne(optional = false)
    //@JoinColumn(name = "vacinas")
    private Pac_vac paciente_vacinas;

    public Vacina(int id, String nome, String patologia) {
        this.id = id;
        this.nome = nome;
        this.patologia = patologia;
    }
    
    @Column(name = "id_vacina")
    public int getIdVacina() {
		return this.id;
	}

	public void setIdVacina(int id) {
		this.id = id;
	}

    @Column(name = "nome")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Column(name = "patologia")
	public String getPatologia() {
		return this.patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
}