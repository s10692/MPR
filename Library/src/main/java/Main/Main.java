package Main;

import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;

import org.example.db.HsqlUnitOfWork;
import org.example.db.dao.BooksDao;
import org.example.db.dao.ClientDao;
import org.example.db.dao.HsqlBooksDao;
import org.example.db.dao.HsqlClientDao;
import org.example.db.dao.HsqlOrderrDao;
import org.example.db.dao.OrderrDao;
import org.example.library.Books;
import org.example.library.Client;
import org.example.library.Orderr;

public class Main {

	public static void main(String[] args) {

		HsqlUnitOfWork uow = new HsqlUnitOfWork();
		ClientDao dao = new HsqlClientDao(uow);
		Client c = new Client();
		BooksDao dao1 = new HsqlBooksDao(uow);
		Books p = new Books();
		Orderr o = new Orderr();
		Calendar cal = Calendar.getInstance();
		OrderrDao dao2 = new HsqlOrderrDao(uow);

		Date d = new Date(cal.getTime().getTime());
		
		o.setorderNumber(1);
		o.setDate(d);
		o.setId(0);
		dao2.save(o);
		
		
		
		
		p.setName("Wladca Pierscieni");
		p.setDescription("Fantasy");
		p.setPrize(13.76);
		p.setId(0);
		dao1.save(p);

		c.setMail("Dariusz@wp.pl");
		c.setName("Dariusz");
		c.setSurname("Felskowski");
		c.setNumber("983746349");
		c.setId(0);
		dao.save(c);

		Client c1 = new Client();

		c1.setMail("Adam@wp.pl");
		c1.setName("Adam");
		c1.setSurname("Nadolny");
		c1.setNumber("938473628");
		c1.setId(0);
		dao.save(c1);

		Client c2 = new Client();

		c2.setMail("Michał@wp.pl");
		c2.setName("Michał");
		c2.setSurname("Bławat");
		c2.setNumber("847593849");
		c2.setId(0);
		dao.save(c2);

		Client c3 = new Client();

		c3.setMail("Mateusz@wp.pl");
		c3.setName("Mateusz");
		c3.setSurname("Ćwikałwoski");
		c3.setNumber("40394853");
		c3.setId(0);
		dao.save(c3);

		Client c4 = new Client();

		c4.setMail("Szymon@wp.pl");
		c4.setName("Szymon");
		c4.setSurname("Malek");
		c4.setNumber("652452685");
		c4.setId(0);
		dao.save(c4);

		dao.delete(c4);
		dao.update(c3);
		uow.commit();
		for (Client cc : dao.getAll()) {
			System.out.println(cc.getName());
		}

		for (Books ccb : dao1.getAll()) {
			System.out.println(ccb.getName());
		}
		for (Orderr cco : dao2.getAll()) {
			System.out.println(cco.getorderNumber());
		}
		uow.close();
		System.out.println("koniec");



	}

}
