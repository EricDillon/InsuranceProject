package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ReportDao;
import com.spring.model.Report;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	ReportDao dao;
	public int addReport(Report r) {
		// TODO Auto-generated method stub
		return dao.addReport(r);
	}

	public List<Report> getReports() {
		// TODO Auto-generated method stub
		return dao.getReports();
	}

	public Report getReport(int rid) {
		// TODO Auto-generated method stub
		return dao.getReport(rid);
	}

	public int editReport(Report r) {
		// TODO Auto-generated method stub
		return dao.editReport(r);
	}

}
