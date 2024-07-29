package onetoonee13.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonee13.dto.AadharCard;
import onetoonee13.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(101);
	aadharCard.setName("POOJITHA JM");
	aadharCard.setAge(14);
	
	Person person=new Person();
	person.setId(1);
	person.setName("Poojitha");
	person.setAddress("Bangalore");
	person.setAadharCard(aadharCard);
	
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
entityTransaction.begin();


entityManager.persist(aadharCard);
entityManager.persist(person);



entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
