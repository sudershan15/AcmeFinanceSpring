package com.foo.Client;

import java.io.*;

public class ToXml 
{

//A method to write historical data in xml format
public void historyxml(DataOutputStream dos, String date, String symbol,long  cap, float low, float open, float high, float close)
{
		String s=symbol;
try 
	{
		dos.writeChars("<date d='"+date+"'>\n");
		dos.writeChars("<cap>"+cap+"</cap>\n");
		dos.writeChars("<low>"+low+"</low>\n");
		dos.writeChars("<open>"+open+"</open>\n");
		dos.writeChars("<high>"+high+"</high>\n");
		dos.writeChars("<close>"+close+"</close>\n");
		dos.writeChars("</date>\n");	
	}
		
catch (IOException e)
	{
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		
} 

//A method to write snapshot data in xml format
	
public void snapshotxml(DataOutputStream dos, long  cap, float low, float open, float high, float close,String date)
{
	try 
	{
		//dos.writeChars("<symbol>"+symbol+"</symbol>\n");
		dos.writeChars("<date d='>"+date+"'>\n");
		dos.writeChars("<cap>"+cap+"</cap>\n");
		dos.writeChars("<low>"+low+"</low>\n");
		dos.writeChars("<open>"+open+"</open>\n");
		dos.writeChars("<high>"+high+"</high>\n");
		dos.writeChars("<close>"+close+"</close>\n");
		dos.writeChars("</date>\n");	
	}
		catch (IOException e)
	{
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		
} 

//A method to write real time data in xml format
public void realtimexml(DataOutputStream dos, String symbol,long  cap, float low, float open, float high, float close)
{
		String s=symbol;
	
try 
		{
		dos.writeChars("<symbol s='"+symbol+"'>\n");
		dos.writeChars("<cap>"+cap+"</cap>\n");
		dos.writeChars("<low>"+low+"</low>\n");
		dos.writeChars("<open>"+open+"</open>\n");
		dos.writeChars("<high>"+high+"</high>\n");
		dos.writeChars("<close>"+close+"</close>\n");
		dos.writeChars("</symbol>\n");	
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 

//A method to write analyzed data in xml format

public void analyzexml(DataOutputStream dos, String symbol,long  cap, float low, float open, float high, float close)
{
	String s=symbol;
try 
		{
        	dos.writeChars("<symbol s='"+symbol+"'>\n");
        	dos.writeChars("<cap>"+cap+"</cap>\n");
        	dos.writeChars("<low>"+low+"</low>\n");
        	dos.writeChars("<open>"+open+"</open>\n");
        	dos.writeChars("<high>"+high+"</high>\n");
        	dos.writeChars("<close>"+close+"</close>\n");
        	dos.writeChars("</symbol>\n");	
			 
		
		}
		
	
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
	
}
	 
	

	

	

