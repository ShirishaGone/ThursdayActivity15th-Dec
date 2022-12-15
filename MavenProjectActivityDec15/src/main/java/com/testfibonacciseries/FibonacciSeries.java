package com.testfibonacciseries;

public class FibonacciSeries {
	int fibonacciseries(int no)
	{
		int n1=0,n2=1,n3=0;
		System.out.println("First and second no:s are :"+ n1+" "+n2);
		for(int i=2;i<=no;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		return n3;
	}
}
