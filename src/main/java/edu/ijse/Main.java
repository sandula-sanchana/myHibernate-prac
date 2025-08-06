package edu.ijse;

import Entity.Customer;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         getAllCus();
    }

    public static void saveCus(){
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Customer customer=new Customer();
        customer.setFirstName("sandtttt");
        customer.setMail("eeeeeeerrrrexxxx");
        session.persist(customer);
        transaction.commit();
        session.close();
    }

    public static void getCus(){
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Customer customer=session.get(Customer.class,2);
        System.out.println(customer);
        transaction.commit();
        session.close();
    }

    public static void updateCus(){
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Customer customer=session.get(Customer.class,2);
        customer.setFirstName("wathsa");
        customer.setMail("eeeeeeeexxxxyy");
        transaction.commit();
        session.close();
    }

    public static void deleteCus(){
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Customer customer=session.get(Customer.class,1);
        session.remove(customer);
        transaction.commit();
        session.close();
    }

    public static void getAllCus(){
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Query<Customer> query=session.createQuery("from Customer",Customer.class);
        List<Customer> customerList=query.list();
        for(Customer customer:customerList){
            System.out.println(customer);
        }
        transaction.commit();
        session.close();
    }
}