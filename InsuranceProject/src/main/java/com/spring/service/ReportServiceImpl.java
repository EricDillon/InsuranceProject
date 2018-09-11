package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ReportDao;
import com.spring.model.Report;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	
	public int addReport(Report r) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Report> getReports() {
		// TODO Auto-generated method stub
		return null;
	}

	public Report getReport(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
