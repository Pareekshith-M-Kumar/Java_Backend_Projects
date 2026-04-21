package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {

            session.beginTransaction();

            Car car = new Car("BMW", "X5", 70000);
            session.persist(car);

            session.getTransaction().commit();

            System.out.println("Inserted!");

        } finally {
            session.close(); // VERY IMPORTANT
            factory.close();
        }
    }
}