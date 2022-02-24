package mainPackage.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mainPackage.Question;

public class SecoundDemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Question q=session.get(Question.class, 103l);
		System.out.println(q.getQuestion());
		session.close();
		System.out.println("Execute...");
		
		
		Session session1=factory.openSession();
		
		Question q1=session1.get(Question.class,103l);
		System.out.println(q1.getQuestion());
		session1
		
		
		.close();
		System.out.println("Successful");
	}

}
