package com.hibernatee.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherMain {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manisha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher t = new Teacher();
		t.setId(11);
		t.setName("Raj");
		t.setSubject("Java");
		t.setSalary(34567.00);
		
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		
		

	}
}
