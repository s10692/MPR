package org.example.db.dao;

import java.util.List;




import org.example.db.Dao;
import org.example.library.Address;

public interface AddressDao extends Dao<Address> {
	
	public List<Address> getAddressByClientId(int id);

}
