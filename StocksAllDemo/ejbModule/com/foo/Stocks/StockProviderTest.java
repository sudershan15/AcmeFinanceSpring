package com.foo.Stocks;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import Domain.Stocks;

public class StockProviderTest {
StockProvider sp=new StockProvider();
	@Test
	public void testGetstocks()
	{
	try{
		boolean check_method=false;
		List<Stocks> s=sp.getstocks("A");
		ListIterator i=s.listIterator();
		while(i.hasNext())
		{
			check_method=true;
		}
		assertEquals("success",true,check_method);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		 
	}

	@Test
	public void testGetstocksbydaterange() {
		 
	}

	@Test
	public void testGetstocksbydate() {
	}

	@Test
	public void testGettopstocks() {
		 
	}

}
