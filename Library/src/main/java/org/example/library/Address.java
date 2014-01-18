package org.example.library;

import org.example.library.Client;

import org.example.db.EntityBase;


public class Address extends EntityBase {
	private String City;
	private String Street;
	private String HouseCode;
	private String PostalCode;
	private Integer LocalNumber;
	
	//relacja adres - klient
		private Client client;
		
		
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getHouseCode() {
		return HouseCode;
	}
	public void setHouseCode(String houseCode) {
		HouseCode = houseCode;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public Integer getLocalNumber() {
		return LocalNumber;
	}
	public void setLocalNumber(Integer localNumber) {
		LocalNumber = localNumber;
	}

}
