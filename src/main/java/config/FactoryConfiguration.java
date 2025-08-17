package config;

import Entity.onetoone.Client;
import Entity.Customer;
import Entity.onetoone.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration=new Configuration().configure();
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Passport.class);
        configuration.addAnnotatedClass(Client.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        if (factoryConfiguration == null) {
            factoryConfiguration = new FactoryConfiguration();
        }
        return factoryConfiguration;
    }

    public Session getSession() {
       return sessionFactory.openSession();
    }
}
