package in.co.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import in.co.rays.User;

public class TestCURD {
	
	public static void main(String[] args) {
		//testAdd();
        //testGet();
		testList();
		}

	public static void testList() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
 		Session session = factory.openSession();
		Query q = session.createQuery("select u.id from User u");
		List list = q.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
		int id = (int) it.next();
		System.out.println(id);
		}
//		List<User>  list = q.list();
//		Iterator <User> it = list.iterator();
//		while (it.hasNext()) {
//			User u = (User) it.next();
//			System.out.println(u.getId());
//    		System.out.println(u.getFirstName());
//    		System.out.println(u.getLastName());
//    		System.out.println(u.getUserName());
//    		System.out.println(u.getPassword());
//			
		
	
//	
//        public static void testGet() {
//        	
//        	SessionFactory factory = new Configuration().configure().buildSessionFactory();
//    		
//    		Session session = factory.openSession();
//    		User u = (User) session.load(User.class, 1);
//    		System.out.println(u.getId());
//    		System.out.println(u.getFirstName());
//    		System.out.println(u.getLastName());
//    		System.out.println(u.getUserName());
//    		System.out.println(u.getPassword());
//    	}
    	
    	
    	
    	
	

//        public static void testAdd() {
//        User u = new User();
//         // u.setId(3);
//		u.setFirstName("Shyam");
//		u.setLastName("Jain");
//		u.setUserName("Shyam.Jain");
//		u.setPassword("SJain1234");
//		
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		
//        Session session = factory.openSession();
//		
//        Transaction tx = session.beginTransaction();
//		
//        session.save(u);
//		
//        tx.commit();
//        session.close();
//		
//        System.out.println("Inserted");
        }
}
	

	
        
 


