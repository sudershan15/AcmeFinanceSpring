package com.foo.Client;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class StockProviderClient2Test {
	StockProviderClient2 s=new StockProviderClient2();
	@Test
	public void testGethistoricaldata() {
		try{
			Boolean check_file=s.gethistoricaldata("AA", "csv");
			
			File f = new File("C:\\275\\outputDir\\historyAA.csv");
			if (check_file= true)
			{
				 assertEquals("success",true,check_file);
				System.out.print(check_file);
			}
			 
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
	@Test
	public void testGetsnapshotdata() {
		try{
			Boolean check_file= s.getsnapshotdata("A","json", "20090209", "20100518");
			
			File f1 = new File("C:\\275\\outputDir\\snapshot-A.xml");
			if (check_file= true)
			{
				 assertEquals("success",true,check_file);
				System.out.print(check_file);
			}
			//fail("Not yet implemented");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	@Test
	public void testGetanalyzedata() {
		 
			try{
				Boolean check_file =s.getanalyzedata("20090209", "json");
				
				File f2 = new File("C:\\275\\outputDir\\analyze-2008-03-11.xml");
				if (check_file= true)
				{
					 assertEquals("success",true,check_file);
					System.out.print(check_file);
				}
				//fail("Not yet implemented");
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}


}
