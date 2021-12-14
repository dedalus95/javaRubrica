package rubricaTelefonica;

public class SchedaContatto {
	
	private String cognome;
	private String nome;
	private String indirizzo;
	private String telefono;
	
	public SchedaContatto(String cognome, String nome, String indirizzo, String telefono) {
		this.cognome =  cognome;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}
	




	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
