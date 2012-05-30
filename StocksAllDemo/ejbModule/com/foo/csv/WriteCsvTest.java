package com.foo.csv;

import static org.junit.Assert.*;

import org.junit.Test;

public class WriteCsvTest {
WriteCsv w=new WriteCsv();
	@Test
	public void testHistorycsv() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		
		boolean result=false;
		boolean check_method=w.historycsv("A",i,f1,f2,f3,f4);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
		 
	}
	

	@Test
	public void testSnapshotcsv() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		
		boolean result=false;
		String sdate=String.valueOf(20080923);
		String edate=String.valueOf(20080912);
	 
		boolean check_method=w.snapshotcsv("A",i,f1,f2,f3,f4,sdate,edate);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
	}
	

	@Test
	public void testAnalyzedcsv() 
	{
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		
		boolean result=false;
		String sdate=String.valueOf(20080923);
		 
		boolean check_method=w.analyzedcsv("A",i,f1,f2,f3,f4,sdate);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
	}
		 
	}
