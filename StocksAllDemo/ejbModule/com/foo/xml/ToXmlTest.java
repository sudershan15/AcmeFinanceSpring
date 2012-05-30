package com.foo.xml;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ToXmlTest {
ToXml t=new ToXml();
	@Test
	public void testHistoryxml() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		
		boolean result=false;
		boolean check_method;
		try {
			check_method = t.historyxml("20097843","A",i,f1,f2,f3,f4);
		
		if(check_method==true)
		{
			result=true;
		}} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("success",true,result);
		 
	}
	

	@Test
	public void testSnapshotxml() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		String sdate=String.valueOf(20080923);
		String edate=String.valueOf(20080912);
		
		boolean result=false;
		boolean check_method;
		try {
			check_method = t.snapshotxml("A",i,f1,f2,f3,f4,sdate);
		
		if(check_method==true)
		{
			result=true;
		}} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("success",true,result);
		 
	}

	@Test
	public void testRealtimexml() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		String sdate=String.valueOf(20080923);
		String edate=String.valueOf(20080912);
		
		boolean result=false;
		boolean check_method;
		try {
			check_method = t.realtimexml("A",i,f1,f2,f3,f4);
		
		if(check_method==true)
		{
			result=true;
		}} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("success",true,result);
		 
	}

	@Test
	public void testAnalyzexml() {
		long i=  118162;
		float f1=  (float) 76.0008;
		float f2=(float) 34.54;
		float f3=  (float) 76.0008;
		float f4=(float) 34.54;
		String sdate=String.valueOf(20080923);
		String edate=String.valueOf(20080912);
		
		boolean result=false;
		boolean check_method;
		try {
			check_method = t.analyzexml("A",i,f1,f2,f3,f4,sdate);
		
		if(check_method==true)
		{
			result=true;
		}} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("success",true,result);
		 
	}

}
