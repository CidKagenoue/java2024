package Hibernate_dog;

import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;
import org.hibernate.Session;

import java.util.List;

public class DogDAO {

    public void createBreed(Dog breed){
        Transaction tx = null;
            try(Session session = HibernateUtil.getSessionFactory().openSession()) {
                tx = (Transaction) session.beginTransaction();
                session.persist(breed);




            }


    }
    private static Dog stringToBreed(String line){
        String[] split = line.split(",");
        return new Dog(split[0], Double.valueOf(split[1]),Double.valueOf(split[2]),split[3]);
    }

}
