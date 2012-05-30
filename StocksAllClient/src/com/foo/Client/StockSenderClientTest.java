package com.foo.Client;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class StockSenderClientTest {

	@Test
	public void testSendMessage() {
		File file = new File("C:/MyFiles/Spring 2012/CMPE 275/project1/full_set/sp080305.txt");
    	BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = null;
			while( (line = br.readLine())!= null )
			{
			StockSenderClient r=new StockSenderClient();
			r.sendMessage(line);
			}
		} 
			catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

}
}
