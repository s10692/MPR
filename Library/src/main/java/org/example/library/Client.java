package org.example.library;

import java.util.List;



import org.example.library.Address;
import org.example.library.Orderr;

import org.example.db.EntityBase;

public class Client extends EntityBase {

	private String Number;
	private String Name;
	private String Surname;
	private String Mail;
	
	//relacja klien-adres
		public List<Address> addresses;
		//relacja klient-zamowienie
		public List<Orderr> orders;
		
		public List<Orderr> getOrders() {
			return orders;
		}
		public void setOrders(List<Orderr> orders) {
			this.orders = orders;
		}
		public List<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}

}
