package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="O nome do produto é obrigatório.")
	@Size(min=3,max=255,message="O nome do produto deve conter no mínimo 3 e máximo 255 caracteres.")
	private String nome;
	
	@NotBlank(message="A descrição do produto é obrigatória.")
	@Size(min=3,max=1000,message="A descrição do produto deve conter no mínimo 3 e máximo 1000 caracteres.")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
