package br.com.springMVCMaven.model;

import java.util.Arrays;

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
	private byte[] imagem;
	
	public Produto() {
		
	}
	
	public Produto(Long id, String nome, String descricao, byte[] imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
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

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", imagem="
				+ Arrays.toString(imagem) + "]";
	}
	

}
