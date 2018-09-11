package com.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Customer;

/*================================================================================================
 * CUSTOMER DAOIMPL
 * 
 * Implements the CustomerDao interface. This class performs the database operations
 *================================================================================================ 
 */

@SuppressWarnings("deprecation")
@Repository
public class CustomerDaoImpl implements CustomerDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addNewCustomer(Customer c) 
	{
		int success=0;
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			success=(Integer)session.save(c);
			tx.commit();
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return success;

	}
	
	public List<Customer> viewAllCustomers() {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Customer> theQuery=  session.createQuery("from Customer", Customer.class);
		List<Customer> claims = theQuery.getResultList();
		tx.commit();
		session.close();
		return claims;
	}
	
	public Customer getCustomer(String email, String password)
	{
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Customer> theQuery=  session.createQuery("from Customer where email = '" + email + "' and "
				+ "password = '" + password + "'", Customer.class);
		System.out.println(email + ", " + password);
		Customer c = theQuery.getSingleResult();
		session.close();
		return c;
	}

	public int updateCustomer(Customer c) {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		session.update(c);
		tx.commit();
		session.close();
		return 0;
	}

	public int inactiveCustomer(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Customer c = (Customer) session.load(Customer.class, new Integer(id));
		if (null != c)
		{
			c.setStatus(false);
			session.update(c);
		}
		tx.commit();
		session.close();
		return 0;
	}

	public List<Customer> getCustomers(String policyNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
