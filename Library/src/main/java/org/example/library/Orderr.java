package org.example.library;

import java.sql.Date;

import java.util.List;

import org.example.library.Client;
import org.example.library.Books;

import org.example.db.EntityBase;

public class Orderr extends EntityBase {

	private int orderNumber;
	private Date Date;
	
	//relacja zamowienie - klient
		private Client client;
		//relacja zamowienie - product
		private List<Books> books;
		
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
	
	
	public int getorderNumber() {
		return orderNumber;
	}
	public void setorderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
}
