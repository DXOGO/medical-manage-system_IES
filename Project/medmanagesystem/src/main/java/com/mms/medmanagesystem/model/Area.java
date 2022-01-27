package com.mms.medmanagesystem.model;

//import lombok.Data;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_area")
    private int id;

    @Column (name = "name")
    private String name; 
    
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "area")
    @JsonIgnore
    private Set<Profissional> profissionais;
    
    
    public Area () {}
    
    public Area(String name) { this.name = name; }

    public int getId() { return this.id; }

	public void setId(int id) { this.id = id; }

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }

}