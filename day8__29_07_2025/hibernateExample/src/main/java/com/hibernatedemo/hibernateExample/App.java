package com.hibernatedemo.hibernateExample;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.hibernateExample.entity.Pan;
public class App 
{
    public static void main( String[] args ){
    SessionFactory factory = new Configuration()
    .configure("hibernate.cfg.xml")
    .addAnnotatedClass(Pan.class)
    .buildSessionFactory();

// Create session
Session session = factory.openSession();

//try {
//// Create a Pan object
//Pan pan = new Pan();
//((Pan) pan).setPanholderName("Ankit Sharma");
//((Pan) pan).setPanNumber("DKYPS1234H");
//
//// Begin transaction
//session.beginTransaction();
//
//// Save the object
//session.save(pan);
//
//// Commit transaction
//session.getTransaction().commit();
//
//System.out.println("Inserted PAN record successfully with ID: " + pan.getId());
//} catch (Exception e) {
//e.printStackTrace();
//} finally {
//session.close();
//factory.close();
//}
}
    }

	