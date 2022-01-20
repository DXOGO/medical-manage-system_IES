/*package com.mms.medmanagesystem.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Data
@Entity
@Table(name = "doenca")
public class Doenca {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String descricao;

	// @OneToMany(cascade = CascadeType.ALL ,mappedBy = "doenca", orphanRemoval = true)
    // private Set<Pac_doenca> doencas;

	@ManyToMany(mappedBy = "doencas")
    private Set<Paciente> pacientes = new HashSet<>();

	public Doenca() {}

    public Doenca(int id, String name, String descricao) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;     
    }


    @Column(name = "id_doenca")
	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

    @Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Column(name = "descricao")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Paciente> getPacientes() {
		return this.pacientes;
	}

	public void setPessoas(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
    
}
*/