package com.mms.medmanagesystem.model;

// import lombok.Data;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.mms.medmanagesystem.messageBroker.Pair;

// @Data
@Entity
@Table(name = "internamento")
public class Internamento {
    @Id
	@Column(name = "id_internamento")
	@GeneratedValue
	private int id;
	
    private Pair pulso;
    private  Float[] pressaoArterial;
    private float temperatura;
	private float oxigenio;
    private String razaoInternamento;
    private String quarto_cama;
    private String estado;
    private Date dataAdmissao;
    private Date dataSaida;
    
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

	@ManyToOne(optional = false)
	@JoinColumn(name="id_medico")
	private Medico medico;


	public Internamento() {}

	// pressao arterial (13,2) 
	// pulso ((2,3),(1,2))
    public Internamento(int id, Paciente paciente, Medico medico, float oxigenio, Pair pulso, Float[] pressaoArterial, float temperatura, String razaoInternamento, String quarto_cama, String estado, Date dataAdmissao, Date dataSaida) { 
        this.id = id;
		this.medico = medico;
		this.paciente = paciente;
        this.pulso = pulso;
		this.oxigenio = oxigenio;
        this.pressaoArterial = pressaoArterial;
        this.temperatura = temperatura;
        this.razaoInternamento = razaoInternamento;
        this.quarto_cama = quarto_cama;
        this.estado = estado;
        this.dataAdmissao = dataAdmissao;
        this.dataSaida = dataSaida;
    }


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Medico getMedico(){
		return this.medico;
	}

	public void setMedico(Medico medico){
		this.medico = medico;
	}

	public int getIdInternamento() {
		return this.id;

	}

	public void setidInternamento(int idInternamento) {
		this.id = idInternamento;
	}


	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

    @Column(name = "pulso")
	public Pair getPulso() {
		return this.pulso;
	}

	@Column(name = "oxigenio")
	public float getOxigenio() {
		return this.oxigenio;
	}

	public void setOxigenio(float oxigenio) {
		this.oxigenio = oxigenio;
	}

	public void setPulso(Pair pulso) {
		this.pulso = pulso;
	}

    @Column(name = "pressaoArterial")
	public Float[] getPressaoArterial() {
		return this.pressaoArterial;
	}

	public void setPressaoArterial(Float[] pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

    @Column(name = "temperatura")
	public float getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
    
    
    @Column(name = "razaoInternamento")
	public String getRazaoInternamento() {
		return this.razaoInternamento;
	}

	public void setRazaoInternamento(String razaoInternamento) {
		this.razaoInternamento = razaoInternamento;
	}

    @Column(name = "quarto_cama")
	public String getQuarto_cama() {
		return this.quarto_cama;
	}

	public void setQuarto_cama(String quarto_cama) {
		this.quarto_cama = quarto_cama;
	}

    @Column(name = "estado")
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


    @Column(name = "dataAdmissao")
    public Date getDataAdmissao() {
		return this.dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

    
    @Column(name = "dataSaida")
	public Date getDataSaida() {
		return this.dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
    
}
