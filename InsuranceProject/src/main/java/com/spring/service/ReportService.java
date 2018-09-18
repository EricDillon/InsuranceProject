package com.spring.service;

import java.util.List;

import com.spring.model.Report;

public interface ReportService {

		public int addReport(Report r);
		public int editReport(Report r);
		public List<Report> getReports();
		public Report getReport(int rid);
	}


