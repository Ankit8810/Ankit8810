package mainPackage.xml;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]) {
		
		
		Person person=new Person(6,"Ankur","Baghpat");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(person);
		try {
		tr.commit();
		
		session.close();
		System.out.println("Inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
