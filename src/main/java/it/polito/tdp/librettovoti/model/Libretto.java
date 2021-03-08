package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();	//this. significa che la variabile non è del singolo metodo
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	/*
	public void stampaVotiUguali(int punteggio) {
		//	Il libretto stampa da solo i voti
		System.out.println();
	}
	
	public String votiUguali(int punteggio) {
		//	Calcola una stringa che contiene i voti
		//	Sarà poi il chiamante a stamparli
	}
	*/
	
	public List<Voto> listavotiUguali(int punteggio) {
		//	Restituisce solo i voti = al criterio
		List<Voto> risultato = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	

	public Libretto votiUguali(int punteggio) {
		//	Restituisce un altro Libretto contenente solo i voti d'interesse
		Libretto risultato = new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}


	@Override
	public String toString() {
		String s = "";
		for(Voto v : this.voti) {
			s = s + v.toString() +"\n";
		}
		return s;
	}
	
	
	
}
