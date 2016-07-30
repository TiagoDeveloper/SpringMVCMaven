package br.com.springMVCMaven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String descricao;
	
	
	public Produto() {
		
	}
	
	public Produto(Long id, String nome, String descricao, byte[] imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		
	}

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


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", imagem="
				+  "]";
	}
	

}
