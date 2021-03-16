package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

	/**
	 *  Memorizza il risultato di un esame
	 * @author Alessandro
	 *
	 */
public class Voto {
	private String nome;
	private int voto;
	private LocalDate data;
	
	
	/**
	 * Costruttore della classe Voto
	 * @param nome Nome corso superato
	 * @param voto Voto esame ottenuto
	 * @param data Data di superamento
	 */
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + ", superato con " + voto + " il " + data;
	}
	
	
	
}
