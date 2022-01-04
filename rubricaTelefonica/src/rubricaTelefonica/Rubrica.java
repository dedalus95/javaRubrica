package rubricaTelefonica;

import java.util.Vector;




public class Rubrica {
	
	
	private Vector<SchedaContatto> listaContatti;
	
	
	
	public Rubrica() {
		this.listaContatti = new Vector<SchedaContatto>();
	}
	
	

	public Vector<SchedaContatto> getListaContatti() {
		return listaContatti;
	}
	
	

	public void setListaContatti(Vector<SchedaContatto> listaContatti) {
		this.listaContatti = listaContatti;
	}
	
	
	/**
	 * Metodo che aggiunge una nuova scheda alla rubrica.
	 * @param contatto
	 */
	
	public void inserisciScheda(SchedaContatto contatto) {
		this.listaContatti.add(contatto);
	}
	
	
	/**
	 * Metodo che rimuove una scheda dalla rubrica.
	 * @param contatto
	 */
	
	

	public int ricerca(String indirizzo, String cognome) {
		for(int i = 0; i < listaContatti.size();i++) {
			if(cognome != null) {
				 if(listaContatti.get(i).getCognome().toUpperCase().equals(cognome.toUpperCase())) {
					 return i;
				 };
			} else if(indirizzo != null) {
				if(listaContatti.get(i).getIndirizzo().toUpperCase().equals(indirizzo.toUpperCase())) {
					return i;
				}
					
			}
			
		}
		return -1;
	}
	
	

	public void rimuoviScheda(int i) {
		
		if(i != -1) {
		listaContatti.remove(i);
		} else if (i == -1) {
			System.out.println("Non trovato.");
		}
	}
	

	
	public void templateScheda(int i) {
		System.out.println(
				listaContatti.get(i).getNome()
				+ " " 
				+ listaContatti.get(i).getCognome() 
				+ " - "
				+ listaContatti.get(i).getIndirizzo()
				+ " - "
				+ listaContatti.get(i).getTelefono());
	}
	
	/**
	 * Metodo che fornisce il template per stampare le schede.
	 * @param scheda
	 */
	
	public void showCard(int i) {

		switch(i) {
		case -1:
		System.out.println("Non trovato.");
		break;
		case -2:
		for(int i1 = 0; i1 < listaContatti.size(); i1++) {
			templateScheda(i1);
		}
		break;
		default:
		templateScheda(i);
		break;
		}
		
	}
}

