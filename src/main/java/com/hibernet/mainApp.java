package com.hibernet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernet.entity.person;

public class mainApp
{
    public static void main(String[] args)
    {

        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            person Person = new person();
            Person.setName("farhanFuadRonok");
            session.save(Person);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        HibernateUtil.shutdown();
    }
}
