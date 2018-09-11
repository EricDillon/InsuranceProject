package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Claim;
import com.spring.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int addEmployee(Employee e) {
		// RESERVED FOR OPTIONAL IMPLEMENTATION
		return 0;
	}

	public Employee login(String username, String password) {
		// TODO Auto-generated method stub
		Employee employee;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Employee> theQuery =  session.createQuery("from Employee where username ='" + username + "' and password ='" + password + "'", Employee.class);
		employee= theQuery.getSingleResult();
		tx.commit();
		session.close();
		return employee;
	}

	public List<Employee> getEmployees() {
		// Not needed according to others
		return null;
	}

	public List<Employee> getEmployees(int role) {
		// TODO Auto-generated method stub
		List<Employee> claims;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Employee> theQuery =  session.createQuery("from Employee where role =" + role, Employee.class);
		claims= theQuery.getResultList();
		tx.commit();
		session.close();
		return claims;
	}
	
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Employee e;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Employee> theQuery =  session.createQuery("from Employee where id =" + id, Employee.class);
		e= theQuery.getSingleResult();
		tx.commit();
		session.close();
		return e;
	}

}
