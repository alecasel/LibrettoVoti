package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libretto {
	
	private List<Voto> voti;
	private Map<String, Voto> votiMap;	//	nome esame -> oggetto Voto
	
	public Libretto() {
		this.voti = new ArrayList<>();	//this. significa che la variabile non è del singolo metodo
		this.votiMap = new HashMap<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
		this.votiMap.put(v.getNome(), v);
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
	
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome
	 * Se il corso non esiste, restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
//		Voto risultato = null;
//		for(Voto v : this.voti) {
//			if(v.getNome().equals(nomeCorso)) {	//NON USARE CompareTo
//				risultato = v;
//				break;
//			}
//		}
//		return risultato;	
		
		return this.votiMap.get(nomeCorso);
	}
	
	/**
	 * Verifica se nel libretto c'è già un voto con lo stesso esame e stessa votazione
	 * 
	 * @param v
	 * @return
	 */
	public boolean esisteDuplicato(Voto v) {
//		boolean trovato = false;
//		for(Voto voto : this.voti) {
//			if(voto.getNome().equals(voto.getNome()) && voto.getVoto()==voto.getVoto()){
//				trovato = true;
//				break;
//			}
//		}
//		return trovato;
		
		Voto trovato = this.votiMap.get(v.getNome());
		if(trovato == null)
			return false;
		if(trovato.getVoto()==v.getVoto()) 
			return true;
		else
			return false;
	}
	
	/**
	 * Verifica se nel libretto c'è già un voto con stesso esame ma votazione diversa
	 * @param v
	 * @return
	 */
	public boolean esisteConflitto(Voto v) {
//		boolean trovato = false;
//		for(Voto voto : this.voti) {
//			if(voto.getNome().equals(voto.getNome()) && voto.getVoto()!=voto.getVoto()){
//				trovato = true;
//				break;
//			}
//		}
//		return trovato;
		
		Voto trovato = this.votiMap.get(v.getNome());
		if(trovato == null)
			return false;
		if(trovato.getVoto()==v.getVoto()) 
			return true;
		else
			return false;
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


	//	Nel toString preferisco navigare sull'ArrayList (mantengo ArrayList)
	@Override
	public String toString() {
		String s = "" ;
		for(Voto v: this.voti) {
			s = s + v.toString() + "\n" ;
		}
		return s ;
	}
	
	
	
}
