package com.mms.medmanagesystem.model;

//import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Data
@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue
    @Column(name = "id_consulta")
    private int id;   
	
	@Column(name = "motivo")
    private String motivo;

    @Column(name = "dataconsulta")
    private String data;

    @Column(name = "anotacoes")
    private String anotacoes;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;

    
	public Consulta() {}

    public Consulta(int id, Paciente paciente, Medico medico, String motivo, String data, String anotacoes) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;
        this.data = data;
        this.anotacoes = anotacoes;
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAnotacoes() {
		return this.anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

    
}

