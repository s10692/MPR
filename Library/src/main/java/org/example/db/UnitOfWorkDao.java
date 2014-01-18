package org.example.db;

import org.example.db.EntityBase;

public interface UnitOfWorkDao {

	  public void persistAdd(EntityBase ent);
	  public void persistDelete(EntityBase ent);
	  public void persistUpdate(EntityBase ent);
}
