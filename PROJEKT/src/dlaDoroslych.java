
public class dlaDoroslych extends film {       //Klasa dziedziczaca klase film
	public String tytu�;
	public String autor;
	public float cena;
	public String gatunek;
	public int ilosc;
	public int wiek;


		
		
	dlaDoroslych(String tytu�, String autor, int cena, String gatunek, int ilosc, int wiek) {
		super(tytu�,autor,cena,gatunek,ilosc);      //super ktore dziedziczy tytul , autora ,cene, gatunek, ilosc z filmu
		this.wiek = wiek; 
		
			}

	
	public String toString() {                        //Metoda dodajaca wiek dla filmu dla doroslych
		return super.toString()+" wiek: " + wiek;
       
	}}