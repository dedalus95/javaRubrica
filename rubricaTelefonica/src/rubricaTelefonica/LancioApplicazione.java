package rubricaTelefonica;

import java.util.Scanner;

public class LancioApplicazione {
	
	//tastiera.next() è il GETS DI JAVA
	// ESEMPIO: metodo(tastiera.next());
	public static void main(String[] args) {
		
		
		Rubrica rubrica = new Rubrica();
		
		Scanner tastiera = new Scanner(System.in);
		
		int key;
		
		
		do {
			System.out.println("0 - ESCI.");
			System.out.println("1 - INSERISCI LA SCHEDA.");
			System.out.println("2 - RIMUOVI LA SCHEDA PER COGNOME.");
			System.out.println("3 - CERCA LA SCHEDA PER COGNOME.");
			System.out.println("4 - CERCA LA SCHEDA PER INDIRIZZO.");
			System.out.println("5 - STAMPA LA RUBRICA.");
			
			key = tastiera.nextInt();
		
			switch (key) {
			case 1: {
				System.out.println("Inserisci cognome");
				String a = tastiera.next();
				System.out.println("Inserisci nome");
				String b = tastiera.next();
				System.out.println("Inserisci indirizzo");
				String c = tastiera.next();
				System.out.println("Inserisci telefono");
				String d = tastiera.next();
				
				SchedaContatto nuovoContatto = new SchedaContatto(a,b,c,d);
				rubrica.inserisciScheda(nuovoContatto);
			}
				
				break;
				
				
				
			case 2: {
				System.out.println("INSERISCI COGNOME.");
				String cog = tastiera.next();
				int i = rubrica.ricerca(null, cog);
				rubrica.rimuoviScheda(i);
			}
				
				break;
			case 3: {
				System.out.println("INSERISCI COGNOME.");
				String cog = tastiera.next();
				int i = rubrica.ricerca(null, cog);
				rubrica.showCard(i);
				
			}
				
				break;
			case 4: {
				System.out.println("INSERISCI INDIRIZZO.");
				String ind = tastiera.next();
				int i = rubrica.ricerca(ind, null);
				rubrica.showCard(i);

			}
				break;
			case 5: {
				System.out.println("ECCO TUTTI I TUOI CONTATTI. \n");
				rubrica.showCard(-2);
			}
				break;
		
			}
		} while (key != 0);
	
		
			}
		}	
	

