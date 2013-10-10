import java.util.ArrayList;  //importowanie list
import java.util.Iterator;   //Importowanie iteratora
import java.util.List;   


public class Wypozyczalnia {      //Poczatek klasy Wypozyczalnia

	private String nazwa;         //zmienna nazwa
	private List listaFilmow;     //Zmienna ListaFilmow
	
	
	Wypozyczalnia() {
		listaFilmow = new ArrayList();
	}

	Wypozyczalnia(String nazwa) {
		this.nazwa = nazwa;
		listaFilmow = new ArrayList();
	}

	public void dodajFilm(film film) {
		listaFilmow.add(film);
	}

	public void wypozyczFilm(film ks, int ile) {
		for (Iterator it = listaFilmow.iterator(); it.hasNext(); ) {
			film film= (film) it.next();                                                       //Metoda wypozyczFilm ktora przeszukuje liste i sprawdza warunek
			if (film.getTytu³().equals(ks.getTytu³()) &&
				film.getAutor().equals(ks.getAutor()) &&                                     
				(film.getCena() == ks.getCena()) &&
				film.getGatunek().equals(ks.getGatunek())) {                                             

				if (film.getIlosc() < ile) {                                                    //warunek sprawdzajcy czy jest w wypozyczalni jest wystarczajaca ilosc filmow              
					System.out.println("W Wypozyczalni " + nazwa + " nie ma " + ile 
							+ " filmów '" + film.getTytu³() + "', autor: " + film.getAutor());
				} else {
					film.setIlosc(film.getIlosc() - ile);                                              //wyswietla wypozyczony film jezeli nie ma to wypozycza tyle ile jest
					System.out.println("Wypozyczono film: '" + film.getTytu³() + "', iloœæ: " + ile); 
				}
			}
		}
	}

	public void wypozyczFilm(film ks) {                                                  //Metoda wypozyczFilm 
		wypozyczFilm(ks, 1);
	}

	public void wyswietlFilm() {
		System.out.println("----------------------------------------");
		System.out.println("Lista filmow wypozyczalni " + nazwa);
		System.out.println("----------------------------------------");                  //Metoda wyswietlajaca filmy za pomoca iteratora i 
		for (Iterator it = listaFilmow.iterator(); it.hasNext(); ) {
			film film= (film) it.next();
			System.out.println(film);
		}
		System.out.println("----------------------------------------");
	}
	
	int Suma(film film){
		return film.getIlosc() * film.getCena();                  //Metoda liczaca laczna cene za film
	}
 
	public static void main(String[] args) throws Exception {
		
		Interfejs klient = new Klient("Dariusz","Felskowski");
		
		
		Wypozyczalnia wypozyczalnia = new Wypozyczalnia("'Karamba'");
		film cena = new film();
		film film1 = new film("Zielona mila", "Frank Darabont", 25, "Dramat", 5);         
		film film2 = new film("Avatar", "James Cameron", 64, "Sci-Fi", 8);
		film film3 = new film("Gladiator", "Ridley Scott", 86, "Dramat historyczny", 3);                    	 
		filmRodzinny film4 = new filmRodzinny("Piraci z Karaibów", "Gore Verbiñski",45,"Fantasy",3,10);      //Przyk³adowa lista filmow
		dlaDoroslych film5 = new dlaDoroslych("Kac Vegas","Todd Philips",15,"Komedia",4,18);
		film film6 = new film("Titanic","James Cameron",43,"Melodramat",8);
		film film7 = new film("Kod da Vinci","Ron Howard",33,"Thriller",3);
		film film8 = new film("Seksmisja","Juliusz Machulski",24,"Komedia",5);                               //Dodatkowa lista filmow ktora mozna dodac
		film film9 = new film("W³adca Pierœcieni","Peter Jackson",35,"Fantasy",7);
		film film10 = new film("Ojciec chrzestny","Francis Ford Coppola",44,"Dramat",9); 
		
	
	  	
     
		wypozyczalnia.dodajFilm(film1);
		wypozyczalnia.dodajFilm(film2);
		wypozyczalnia.dodajFilm(film3);                                          //wywolanie metody dodajFilm
		wypozyczalnia.dodajFilm(film4);
		wypozyczalnia.dodajFilm(film5);
	
        System.out.println("Imie Klienta to : "+klient.imie);             //przykladowe uzycie intefejsu
        System.out.println("Nazwisko Klienta to : "+klient.nazwisko);

		wypozyczalnia.wyswietlFilm();                                           // wyœwietlenie filmów za pomoca Iteratora
		
		film[] filmy = new film[5];
		try{                                                                    //Sprawdzanie czy film jest aktualnie w wypozyczalni za pomoca wyjatku
		filmy[0] = film1;                                                       // wyœwietlenie filmow za pomoca polimorfizmu
		filmy[1] = film2;                                                       // wyœwietlenie filmow za pomoca polimorfizmu
		filmy[2] = film3;                                                       // wyœwietlenie filmow za pomoca polimorfizmu
		filmy[3] = film4;                                                       // wyœwietlenie filmow za pomoca polimorfizmu
		filmy[4] = film5;                                                       // wyœwietlenie filmow za pomoca polimorfizmu
		filmy[10] = film10;                                                      //proba wyswietlenia filmu z poza tablicy
		}
		catch (ArrayIndexOutOfBoundsException exc){                            //wylapanie wyjatku
			System.err.println("Aktualnie tego filmu nie ma w naszej ofercie");
		} 
			 
		for (int i = 0; i<5 ; i++)                                             // wyœwietlenie filmow za pomoca polimorfizmu
		{                                                                      // wyœwietlenie filmow za pomoca polimorfizmu
			System.out.println(filmy[i]);                                      // wyœwietlenie filmow za pomoca polimorfizmu
		}                                                                      // wyœwietlenie filmow za pomoca polimorfizmu
		
		
		System.out.println("----------------------------------------");	
		
		wypozyczalnia.wypozyczFilm(film1);
		wypozyczalnia.wypozyczFilm(film2, 2);
		wypozyczalnia.wypozyczFilm(film3, 4);
		wypozyczalnia.wypozyczFilm(film3, 3);                                   //Wywolanie metody wypozyczFilm
		wypozyczalnia.wypozyczFilm(film4, 4);
        wypozyczalnia.wypozyczFilm(film5, 3);
		
        wypozyczalnia.wyswietlFilm();                                           //wywolanie metody wyswietlFilm
        
    
    	
        
        
       System.out.println("Zawartosc Koszyka: "+film1.getTytu³()+" cena: "+film1.getCena()+" " + film2.getTytu³()+" cena: "+film2.getCena()+" "+film3.getTytu³()+" " +"cena: "+film3.getCena()+" "+film4.getTytu³()+" "+"cena: "+" "+film4.getCena());
          // Wyswietlenie koszyka 
      
		
			System.out.println("Zap³acono ³acznie: "+(wypozyczalnia.Suma(film1)+wypozyczalnia.Suma(film2)+wypozyczalnia.Suma(film3)+wypozyczalnia.Suma(film4))+" "+"z³");
		//Wyswietlenie ceny za zakupione filmy
	
	}


}