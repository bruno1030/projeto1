package com.bruno.projeto1.entity;

import javax.persistence.Entity;

import java.util.Set;

import javax.persistence.*;     // a estrela faz com que ele importe tudo que seja do javax.persistence, entao em tese nem precisaria ter mais o javax.persistence.Entity

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String name;
	
	private String email;
	
	@ManyToMany
	private Set<Role> roles;    //set eh como se fosse uma lista... E roles sao como se fosse um perfil (na regra de negocio do curso)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
