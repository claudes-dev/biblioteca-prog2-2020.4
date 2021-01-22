package model;

import java.util.Date;

public class Livro {

	private int id;
	private String nome;
	private String autor;
	private String genero;
	private String editora;
	private Date anoPublicacao;
	private String disponibilidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
