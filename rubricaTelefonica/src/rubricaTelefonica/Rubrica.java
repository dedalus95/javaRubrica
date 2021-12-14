package rubricaTelefonica;

import java.util.Vector;



public class Rubrica {
	
	
	private Vector<SchedaContatto> listaContatti;
	
	
	
	public Rubrica() {
		this.listaContatti = new Vector<SchedaContatto>(200);
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

	public void rimuoviScheda(SchedaContatto contatto) {
		this.listaContatti.remove(contatto);
	}
	

    /**
     * Metodo che ricerca una scheda in base al cognome inserito.
     * Case insensitive.
     * @param cognome
     */
	public void ricercaPerCognome(String cognome) {
		listaContatti.forEach((scheda) -> {
			if(cognome.toUpperCase().equals(scheda.getCognome().toUpperCase()))
			{
				this.showCard(scheda);
			}
		});
	}
	
	
	/**
	 * Metodo che ricerca una scheda in base all'indirizzo inserito.
	 *Case insensitive.
	 * @param indirizzo
	 */
	
	public void ricercaPerIndirizzo(String indirizzo) {
		listaContatti.forEach((scheda) -> {
			if(indirizzo.toUpperCase().equals(scheda.getIndirizzo().toUpperCase()))
			{
				showCard(scheda);
			} 
		});
	}
	
	
	/**
	 * Metodo che stampa tutte le schede.
	 */
	
	public void mostraTutteLeSchede() {
		listaContatti.forEach((scheda) -> {
			showCard(scheda);
		});
	}
	
	
	/**
	 * Metodo che fornisce il template per stampare le schede.
	 * @param scheda
	 */
	
	private void showCard(SchedaContatto scheda) {
		System.out.println(
				  scheda.getNome() 
				+ " " 
				+ scheda.getCognome() 
				+ " - "
				+ scheda.getIndirizzo()
				+ " - "
				+ scheda.getTelefono());
	}
}

