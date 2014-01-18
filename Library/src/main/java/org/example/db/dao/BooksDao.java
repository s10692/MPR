package org.example.db.dao;

import org.example.db.Dao;


import org.example.library.Books;


public interface BooksDao extends Dao<Books>{
		public void setOrders(Books p);
}

