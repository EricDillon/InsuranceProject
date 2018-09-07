package com.spring.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Claim;

/*================================================================================================
 * ClaimDaoImpl
 * -----------------------------------------------------------------------------------------------
 * 
 * This class handles all operations related to connecting with the database. Implements all
 * methods in the ClaimDao interface
 *================================================================================================ 
 */

@Repository
public class ClaimDaoImpl implements ClaimDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int addClaim(Claim c) 
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

	public List<Claim> getClaims() {
		// TODO Auto-generated method stub
		List<Claim> claims;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Claim> theQuery =  session.createQuery("from Claim", Claim.class);
		claims= theQuery.getResultList();
		tx.commit();
		session.close();
		return claims;
	}

	public List<Claim> getClaims(String policyNum) {
		// TODO Auto-generated method stub
		
		
		List<Claim> claims;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Claim> theQuery =  session.createQuery("from Claim where policyNum ='" + policyNum + "'", Claim.class);
		claims= theQuery.getResultList();
		tx.commit();
		session.close();
		return claims;
	}

	public Claim getClaim(int id) {
		// TODO Auto-generated method stub
		Claim claim;
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Query<Claim> theQuery =  session.createQuery("from Claim where id =" + id, Claim.class);
		claim= theQuery.getSingleResult();
		tx.commit();
		session.close();
		return claim;
	}

}