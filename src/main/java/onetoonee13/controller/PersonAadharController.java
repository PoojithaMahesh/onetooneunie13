package onetoonee13.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonee13.dao.AadharCardDao;
import onetoonee13.dao.PersonDao;
import onetoonee13.dto.AadharCard;
import onetoonee13.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(3);
//	person.setName("Abhishek");
//	person.setAddress("Bang");
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(103);
//	aadharCard.setName("ABHISHEK C");
//	aadharCard.setAge(23);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(3, aadharCard);
	
//	find
//	
//	PersonDao  personDao=new PersonDao();
//	personDao.findPerson(1);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.findAadharCard(103);
	
//	AadharCard aadharCard=new AadharCard();
//
//	aadharCard.setName("ABHI C");
//	aadharCard.setAge(25);
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.updateAadharCard(103, aadharCard);
	
	
	Person person=new Person();
	
	person.setName("Abhishek");
	person.setAddress("Bang");
	
	
	PersonDao personDao=new PersonDao();
	
	personDao.updatePerson(3, person);
	
	
	
	
	
	
}
}
