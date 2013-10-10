

public class film {
	public String tytu³;
	private String autor;
	public int cena;
	private String gatunek;                                 //Zmienne
	private int ilosc;
	public int wiek;
	public int balance;

	film() {
		this.tytu³ = "";
		this.autor = "";
		this.cena = 0;                                     //Konstruktor bezparametrowy
		this.gatunek = "";
		this.ilosc = 0;
}

	film(String tytu³, String autor, int cena, String gatunek, int ilosc) {              
		this.tytu³ = tytu³;
		this.autor = autor;
		this.cena = cena;                                  //Konstruktor z parametrami
		this.gatunek = gatunek;
		this.ilosc = ilosc;
	}

	public int getwiek(){                                  
		return wiek;                                               
	}
	public void setwiek(int wiek){
		this.wiek=wiek;
	}
   public String getTytu³() {
		return tytu³;
	}

	public void setTytu³(String tytu³) {
		this.tytu³ = tytu³;
	}
                                                                            //Metody i klasy ustawiajace zmienne
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) { 
		this.autor = autor;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public String toString() {
		return "Film " + "'" + tytu³ + "', autora: " + autor
			 + ", cena: " + cena + ", gatunek: '" + gatunek
			 + "', dostêpna iloœæ: " + ilosc;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	
	
}