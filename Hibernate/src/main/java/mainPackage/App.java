package mainPackage;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner input=new Scanner(System.in);
       // StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        
      //  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
     
     //SessionFactory factory = (SessionFactory) meta.getSessionFactoryBuilder().build();
        //SessionFactory factory=Configuration().configure().buildSessionFactory();
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory factory=(SessionFactory) con.buildSessionFactory();
        
        Session session = factory.openSession();  
        
        Transaction t = session.beginTransaction();   
               
       // Employee e1=new Employee();    
        
        //insert Data
		/*
		 * e1.setId(102); e1.setEmployeeName("Govind"); e1.setCity("Shmali");
		 * 
		 * session.save(e1);
		 */
        
        //get Employee
        //System.out.println("Enter The Employee_Id=");
        
        //long l=input.nextLong();
        //Employee emp=(Employee)session.get(Employee.class, l);
        //System.out.println(emp);
        
        
//        Question q=new Question();
//        q.setQuestionId(104);
//        q.setQuestion("What is java?");
//        
//        Answer ans=new Answer();
//        ans.setAnswerId(124);
//        ans.setAnswer("java is a platform independent programing language and a plateform.");
//        ans.setQuestion(q);
//        
//        q.setAnswer(ans);
//        session.save(ans);
//        session.save(q);
        
//        Question emp=session.get(Question.class, 103);
// 	   System.out.print(emp.getQuestion());
// 	   
// 	   System.out.println("Executed...");
// 	    Question emp1=session.get(Question.class,103);
// 	    System.out.println(emp1.getQuestion());
        
        
        
        
//        System.out.println("Enter the Question Id=");
//        long l=input.nextLong();
       Question q1=new Question();
         Question g=session.get(Question.class, 103l);
        
        System.out.println(g.getQuestion());
        
//        System.out.println("Enter the Question Id=");
//        long l1=input.nextLong();
        Question q2=new Question();
        Question g2=session.get(Question.class, 103l);
        System.out.println(g2.getQuestion());
        System.out.println(session.contains(g2));
        
      //  System.out.println(g.getAnswer().getAnswer());
         t.commit();  
         System.out.println("successfully saved");    
        
         session.close();    
             
     }    
}

