package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create ONE Employee
		Employee employee = new Employee();
		employee.setName("Zubeir");
		employee.setSalary(40000);
        em.persist(employee);
        
        Manager manager = new Manager();
        manager.setName("Vaishali");
        manager.setSalary(50000);
        manager.setDepartmentname("Exceutive");
        em.persist(manager);
        
        em.getTransaction().commit();
        
        em.close();
        factory.close();
        System.out.println("Added one employee and manager to database");
	}
}
