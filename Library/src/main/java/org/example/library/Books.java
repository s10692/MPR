package org.example.library;


import org.example.db.EntityBase;

public class Books extends EntityBase {

	private String Name;
    private String Description;
    private String Kind_Of_Book;
    private Double Prize;
    
    
  //relacje product - zamowienie
  	private Orderr order;
  	
  	public Orderr getOrder() {
  		return order;
  	}
  	
  	public void setOrder(Orderr order) {
  		this.order = order;
  	}
    
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getKind_Of_Book() {
		return Kind_Of_Book;
	}
	public void setKind_Of_Book(String kind_Of_Book) {
		Kind_Of_Book = kind_Of_Book;
	}
	public Double getPrize() {
		return Prize;
	}
	public void setPrize(Double prize) {
		Prize = prize;
	}
    

}
