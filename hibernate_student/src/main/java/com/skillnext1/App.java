package com.skillnext1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student std = new Student("Rakesh","CSE"
            
                
        );

        session.persist(std);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}

