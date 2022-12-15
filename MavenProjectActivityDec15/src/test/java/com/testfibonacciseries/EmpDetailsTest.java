package com.testfibonacciseries;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;


import org.junit.jupiter.api.Test;

class EmpDetailsTest {

	static EmpDetails emp;
    static EmpLogic empLogic;
	
    @BeforeAll()
    static void setup()
    {
    	emp=new EmpDetails();
    	empLogic=new  EmpLogic();
    }
    @Test()
    void testCalculateYearlySalary()
    {
    	emp.setEmpName("Shirisha");
    	emp.setMonthlySalary(25000);
    	emp.setAge(25);
    	double salary=empLogic.calculateYearlySalary(emp);
    	assertEquals(27000,salary);
    	
    	
    }
    @Test()
    void testCalculateAppraisal()
    {
    	emp.setEmpName("Shirisha");
    	emp.setMonthlySalary(25000);
    	emp.setAge(23);
    	double appraisal=empLogic.calculateAppraisal(emp);
    	assertEquals(1000,appraisal);
    }

}
