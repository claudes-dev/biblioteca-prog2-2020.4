package br.com.ufrpe.biblioteca.models;

public class Evento {

	private String nome;
	private String livro;
	private String data;
	private String entrega;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return livro;
	}
	public void setLocal(String local) {
		this.livro = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return entrega;
	}
	public void setHorario(String horario) {
		this.entrega = horario;
	}
	
	
}
