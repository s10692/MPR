
public class filmRodzinny extends film {   //Klasa dziedziczaca Klase Film
	public String tytu³;
	public String autor;
	public float cena;
	public String gatunek;
	public int ilosc;
	public int wiek;


		
		
		
	filmRodzinny(String tytu³, String autor, int cena, String gatunek, int ilosc, int wiek) {
		super(tytu³,autor,cena,gatunek,ilosc);                      //super ktore dziedziczy tytul autor cena gatunek ilosc z filmu
		this.wiek = wiek;
		
			}

	
	public String toString() {                           //Metoda Dodajaca do filmu rodzinnego limit wieku
		return super.toString()+" wiek: "+wiek;
       
	}}
	