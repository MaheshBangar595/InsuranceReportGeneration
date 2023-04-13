package com.insuranceReport.service;

import java.util.List;

import com.insuranceReport.entity.CitizenPlan;
import com.insuranceReport.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	public List<CitizenPlan> search(SearchRequest searchRequest);
	public boolean exportExcel();
	public boolean exportPdf();
	

}
