package org.example.db.dao;

import java.util.ArrayList;


import java.util.List;

import org.example.db.EntityBase;
import org.example.db.MockDB;
import org.example.library.Client;
//koment
public class MockClientDaoImpl implements ClientDao{

        private MockDB db;
        
        
        
        public MockClientDaoImpl(MockDB db) {
        
                this.db = db;
        }

        public void save(Client ent) {
                db.save(ent);
                
        }

        public void delete(Client ent) {
                db.getItems().remove(ent);
                
        }

        public List<Client> getAll() {
                List<Client> result = new ArrayList<Client>();
                for(EntityBase ent: db.getItems())
                {
                        if(ent instanceof Client)
                                result.add((Client)ent);
                }
                
                return result;
        }

        public Client get(int id) {
                for(Client c: getAll())
                {
                        if(c.getId()==id)
                        {
                                Client c1 = new Client();
                                c1.setId(c.getId());
                                c1.setMail(c.getMail());
                                c1.setNumber(c.getNumber());
                                c1.setSurname(c.getSurname());
                                c1.setName(c.getName());
                                return c1;
                        }
                }
                return null;
        }

        public void setAddresses(Client c) {
                
                
        }

        public void setOrders(Client c) {
                
                
        }

        public void update(Client ent) {
                // TODO Auto-generated method stub
                
        }

}