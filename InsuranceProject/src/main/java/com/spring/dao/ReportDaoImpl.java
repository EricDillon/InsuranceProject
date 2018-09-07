package com.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Report;

@Repository
public class ReportDaoImpl implements ReportDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int addReport(Report r) {
		// TODO Auto-generated method stub
		int success=0;
		try {
			Session session=sessionFactory.openSession();
			
			success=(Integer)session.save(r);
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return success;
	}

	public List<Report> getReports() {
		// TODO Auto-generated method stub
		List<Report> reports;
		Session session=sessionFactory.openSession();
		Query<Report> theQuery =  session.createQuery("from Report", Report.class);
		reports = theQuery.getResultList();
		session.close();
		return reports;
	}

	public Report getReport(int id) {
		Report report;
		Session session=sessionFactory.openSession();
		Query<Report> theQuery =  session.createQuery("from Report where id =" + id, Report.class);
		report= theQuery.getSingleResult();
		session.close();
		return report;
	}

}
