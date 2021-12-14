package rubricaTelefonica;

public class LancioApplicazione {
	public static void main(String[] args) {
		
		
		Rubrica rubrica1 = new Rubrica();
		
		
		SchedaContatto contatto1 = new SchedaContatto("Cerilli", "Emanuele", "Via Milazzo", "06XXXXXX");
		SchedaContatto contatto2 = new SchedaContatto("Rossi", "Mario", "Via Luciani", "06XXXXXX");
		SchedaContatto contatto3 = new SchedaContatto("Mariani", "Giuliano", "Via Mozart", "06XXXXXX");
		SchedaContatto contatto4 = new SchedaContatto("Franceschetti", "Valerio", "Via Respighi", "06XXXXXX");
		SchedaContatto contatto5 = new SchedaContatto("Ibrahimovic", "Zlatan", "Via Maliani", "06XXXXXX");
		SchedaContatto contatto6 = new SchedaContatto("Ronaldo", "Cristiano", "Via Andreoli", "06XXXXXX");
		SchedaContatto contatto7 = new SchedaContatto("Loria", "Simone", "Via Giulia", "06XXXXXX");
		SchedaContatto contatto8 = new SchedaContatto("Totti", "Francesco", "Via Europa", "06XXXXXX");
		SchedaContatto contatto9 = new SchedaContatto("De Rossi", "Daniele", "Via Asia", "06XXXXXX");
		SchedaContatto contatto10 = new SchedaContatto("Perrotta", "Simone", "Via Eufrate", "06XXXXXX");
		SchedaContatto contatto11 = new SchedaContatto("Di Natale", "Antonio", "Via Tigri", "06XXXXXX");
		SchedaContatto contatto12 = new SchedaContatto("Maldini", "Paolo", "Via Milano", "06XXXXXX");
		SchedaContatto contatto13 = new SchedaContatto("Nesta", "Alessandro", "Via Mosca", "06XXXXXX");
		SchedaContatto contatto14 = new SchedaContatto("Kjaer", "Simon", "Via Liegi", "06XXXXXX");
		SchedaContatto contatto15 = new SchedaContatto("Calabria", "Davide", "Via America", "06XXXXXX");
		SchedaContatto contatto16 = new SchedaContatto("Dybala", "Paulo", "Via Torino", "06XXXXXX");
		SchedaContatto contatto17 = new SchedaContatto("Belotti", "Andrea", "Via delle Alpi", "06XXXXXX");
		SchedaContatto contatto18 = new SchedaContatto("Martinez", "Lautaro", "Via Nottingham", "06XXXXXX");
		SchedaContatto contatto19 = new SchedaContatto("Ranocchia", "Andrea", "Via Udine", "06XXXXXX");
		SchedaContatto contatto20 = new SchedaContatto("Lukaku", "Romelu", "Via Londra", "06XXXXXX");
		SchedaContatto contatto21 = new SchedaContatto("Insigne", "Lorenzo", "Via Napoli", "06XXXXXX");
		SchedaContatto contatto22 = new SchedaContatto("Morata", "Alvaro", "Via Bruxelles", "06XXXXXX");
		SchedaContatto contatto23 = new SchedaContatto("Messi", "Lionel", "Via Tamigi", "06XXXXXX");
		SchedaContatto contatto24 = new SchedaContatto("Icardi", "Mauro", "Via Parigi", "06XXXXXX");
		SchedaContatto contatto25 = new SchedaContatto("Kessie", "Frank", "Via del Duomo", "06XXXXXX");



		
		rubrica1.inserisciScheda(contatto1);
		rubrica1.inserisciScheda(contatto2);
		rubrica1.inserisciScheda(contatto3);
		rubrica1.inserisciScheda(contatto4);
		rubrica1.inserisciScheda(contatto5);
		rubrica1.inserisciScheda(contatto6);
		rubrica1.inserisciScheda(contatto7);
		rubrica1.inserisciScheda(contatto8);
		rubrica1.inserisciScheda(contatto9);
		rubrica1.inserisciScheda(contatto10);
		rubrica1.inserisciScheda(contatto11);
		rubrica1.inserisciScheda(contatto12);
		rubrica1.inserisciScheda(contatto13);
		rubrica1.inserisciScheda(contatto14);
		rubrica1.inserisciScheda(contatto15);
		rubrica1.inserisciScheda(contatto16);
		rubrica1.inserisciScheda(contatto17);
		rubrica1.inserisciScheda(contatto18);
		rubrica1.inserisciScheda(contatto19);
		rubrica1.inserisciScheda(contatto20);
		rubrica1.inserisciScheda(contatto21);
		rubrica1.inserisciScheda(contatto22);
		rubrica1.inserisciScheda(contatto23);
		rubrica1.inserisciScheda(contatto24);
		rubrica1.inserisciScheda(contatto25);

		
		
		rubrica1.ricercaPerCognome("Ronaldo");
		
		System.out.println("--------------------------------------------------------------");
		
		rubrica1.ricercaPerIndirizzo("Via delle Alpi");
		
		System.out.println("--------------------------------------------------------------");
		
		rubrica1.mostraTutteLeSchede();
		
		System.out.println("--------------------------------------------------------------");
		
		rubrica1.rimuoviScheda(contatto12);
		
		System.out.println("--------------------------------------------------------------");
		
		rubrica1.mostraTutteLeSchede();
		
		
		


		

	}
}
