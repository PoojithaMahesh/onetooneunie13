package onetoonee13.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonee13.dto.AadharCard;
import onetoonee13.dto.Person;

public class AadharCardDao {

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		first i going to check whether this person is the valid person
		Person person=entityManager.find(Person.class, personId);
		if(person!=null) {
//		he is the valid person then i can issue the aadharcard
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
//		update this person details
		person.setAadharCard(aadharCard);
		entityManager.merge(person);
		entityTransaction.commit();
		}else {
			System.out.println("Sorry PersonId is not present");
		}
		
	}
	public void findAadharCard(int aadharCardId) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, aadharCardId);
		if(dbAadharCard!=null) {
//			person is present
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry AadharCard id is not present");
		}
	}
	
	public void updateAadharCard(int aadharCardid,AadharCard aadharCard) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, aadharCardid);
		if(dbAadharCard!=null) {
//			update the datas
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(aadharCardid);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry Id is not present to update the data");
		}
	}
	
	
	public void deleteAadharCard(int aadharCardId) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, aadharCardId);
		if(dbAadharCard!=null) {
//			person is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry AadharCard id is not present");
		}
	
	
	
	
	}
	
	
	
}
