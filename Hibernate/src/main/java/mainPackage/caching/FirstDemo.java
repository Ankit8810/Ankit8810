package mainPackage.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mainPackage.Question;

public class FirstDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction t = session.beginTransaction();  
	   Question emp=session.get(Question.class, 103l);
	   System.out.print(emp.getQuestion());
	   
	   System.out.println("Executed...");
	    Question emp1=session.get(Question.class,103l);
	    System.out.println(emp1.getQuestion());
	    t.commit();
	    session.close();

	}

}
