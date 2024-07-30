package onetoonee13.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonee13.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void findPerson(int personId) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			person is present
			System.out.println(dbPerson);
		}else {
			System.out.println("Sorry person id is not preseny");
		}
	}
	
	public void updatePerson(int personId,Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			person is present
//			updaye the person details
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			person.setId(personId);
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry person id is not preseny");
		}
	}
	
	
	
	
}
