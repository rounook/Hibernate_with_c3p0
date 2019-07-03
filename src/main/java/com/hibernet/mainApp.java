package com.hibernet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernet.entity.person;

public class mainApp
{
    public static void main(String[] args)
    {
        HibernateUtil.createRecord();
        HibernateUtil.shutdown();
    }
}
