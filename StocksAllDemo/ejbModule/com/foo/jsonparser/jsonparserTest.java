package com.foo.jsonparser;

import static org.junit.Assert.*;

import org.junit.Test;

public class jsonparserTest {
jsonparser j=new jsonparser();
	@Test
	public void testHistoryjson() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		
		boolean result=false;
		boolean check_method=j.historyjson("A",i,f1,f2,f3,f4);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
		 
	}

	@Test
	public void testSnapshotjson() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		String sdate=String.valueOf(20080923);
		String edate=String.valueOf(20080912);
		boolean result=false;
		boolean check_method=j.snapshotjson("A",i,f1,f2,f3,f4,sdate,edate);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
	}

	@Test
	public void testAnalyzedjson() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		String sdate=String.valueOf(20080923);
		 
		boolean result=false;
		boolean check_method=j.analyzedjson("A",i,f1,f2,f3,f4,sdate);
		if(check_method==true)
		{
			result=true;
		}
		
		assertEquals("success",true,result);
		 
	}

}
