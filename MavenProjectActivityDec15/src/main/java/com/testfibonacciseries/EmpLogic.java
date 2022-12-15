package com.testfibonacciseries;

public class EmpLogic {
	public double calculateYearlySalary(EmpDetails empDetails) {
		double yearlySalary=empDetails.getMonthlySalary()*12;
		return yearlySalary;
		
	}
	public double calculateAppraisal(EmpDetails empDetails) {
		double appraisal=0;
		if(empDetails.getMonthlySalary()<20000)
		{
			appraisal=1500;
			
		}
		else
		{
			appraisal=1000;
		}
		return appraisal;
		
	}
	
}
