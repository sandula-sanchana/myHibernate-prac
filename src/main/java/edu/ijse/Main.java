package edu.ijse;

import Entity.onetoone.Client;
import Entity.onetoone.Passport;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Session session= FactoryConfiguration.getInstance().getSession();
       Transaction transaction= session.beginTransaction();
        Client client = new Client();
        Passport passport = new Passport();
        passport.setDate(new Date());
        client.setName("sandula");
        client.setPassport(passport);
        session.persist(client);
        transaction.commit();
        session.close();
    }

//    public static void saveCus(){
//        Session session= FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        Customer customer=new Customer();
//        customer.setFirstName("sandtttt");
//        customer.setMail("eeeeeeerrrrexxxx");
//        session.persist(customer);
//        transaction.commit();
//        session.close();
//    }
//
//    public static void getCus(){
//        Session session= FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        Customer customer=session.get(Customer.class,2);
//        System.out.println(customer);
//        transaction.commit();
//        session.close();
//    }
//
//    public static void updateCus(){
//        Session session= FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        Customer customer=session.get(Customer.class,2);
//        customer.setFirstName("wathsa");
//        customer.setMail("eeeeeeeexxxxyy");
//        transaction.commit();
//        session.close();
//    }
//
//    public static void deleteCus(){
//        Session session= FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        Customer customer=session.get(Customer.class,1);
//        session.remove(customer);
//        transaction.commit();
//        session.close();
//    }
//
//    public static void getAllCus(){
//        Session session= FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        Query<Customer> query=session.createQuery("from Customer",Customer.class);
//        List<Customer> customerList=query.list();
//        for(Customer customer:customerList){
//            System.out.println(customer);
//        }
//        transaction.commit();
//        session.close();
//    }
}