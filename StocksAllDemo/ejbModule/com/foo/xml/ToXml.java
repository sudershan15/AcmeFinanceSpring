package com.foo.xml;
import java.io.*;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ToXml
 */
@Stateless
public class ToXml implements ToXmlRemote, ToXmlLocal {

    /**
     * Default constructor. 
     */
    public ToXml( ) 
    {  
    
	
        // TODO Auto-generated constructor stub
    }
  

  //A method to write historical data in xml format
 public boolean historyxml(String date, String symbol,long  cap, float low, float open, float high, float close) throws IOException
 {
    	String m=symbol;
    	System.out.println(m);
    	String fpath = null;
    	FileOutputStream fos = null; 	
	    DataOutputStream dos = null;
        File xmlFile;
        fpath = "C:\\275\\outputDir\\history-"+m+".xml";
        xmlFile = new File(fpath);
  
    	 
   if(!xmlFile.exists())
   { 	
    	try 
    {
    	
	        fos = new FileOutputStream(xmlFile);
            dos=new DataOutputStream(fos);
		
    		dos.writeChars("<?xml version=\'1.0\'>\n");
    		dos.writeChars("<Stock>\n");
    		dos.writeChars("<symbol>"+m+"</symbol>\n");
    		dos.writeChars("<date d='"+date+"'>\n");
    		dos.writeChars("<cap>"+cap+"</cap>\n");
    		dos.writeChars("<low>"+low+"</low>\n");
    		dos.writeChars("<open>"+open+"</open>\n");
    		dos.writeChars("<high>"+high+"</high>\n");
    		dos.writeChars("<close>"+close+"</close>\n");
    		dos.writeChars("</date>\n");
    }
    	catch(IOException e)
    {
    	e.printStackTrace();
    }
    	}
   else
   {
		try 
	    {
	    fos = new FileOutputStream(xmlFile, true);
	    dos=new DataOutputStream(fos);
	   	//dos.writeChars("<symbol>"+m+"</symbol>\n");
		dos.writeChars("<date d='"+date+"'>\n");
		dos.writeChars("<cap>"+cap+"</cap>\n");
		dos.writeChars("<low>"+low+"</low>\n");
		dos.writeChars("<open>"+open+"</open>\n");
		dos.writeChars("<high>"+high+"</high>\n");
		dos.writeChars("<close>"+close+"</close>\n");
		dos.writeChars("</date>\n");
	    }
   
    	catch(IOException e)
    {
    	e.printStackTrace();
    }
   }
   
 dos.writeChars("</Stock>\n");	
 return true;
 }
        
    
   	
		
    		
     

    //A method to write snapshot data in xml format
    	
public boolean snapshotxml(String symbol, long  cap, float low, float open, float high, float close,String date)throws IOException
{
    String m=symbol;
	System.out.println(m);
	String fpath = null;
	FileOutputStream fos = null; 	
    DataOutputStream dos = null;
    File xmlFile;
    fpath = "C:\\275\\outputDir\\snapshot-"+m+".xml";
    xmlFile = new File(fpath);

	 
if(!xmlFile.exists())
{ 	
	try 
{
	
        fos = new FileOutputStream(xmlFile);
        dos=new DataOutputStream(fos);
	
		dos.writeChars("<?xml version=\'1.0\'>\n");
		dos.writeChars("<Stock>\n");
		dos.writeChars("<symbol>"+m+"</symbol>\n");
		dos.writeChars("<date d='"+date+"'>\n");
		dos.writeChars("<cap>"+cap+"</cap>\n");
		dos.writeChars("<low>"+low+"</low>\n");
		dos.writeChars("<open>"+open+"</open>\n");
		dos.writeChars("<high>"+high+"</high>\n");
		dos.writeChars("<close>"+close+"</close>\n");
		dos.writeChars("</date>\n");
}
	catch(IOException e)
{
	e.printStackTrace();
}
	}
else
{
	try 
    {
    fos = new FileOutputStream(xmlFile, true);
    dos=new DataOutputStream(fos);
   	//dos.writeChars("<symbol>"+m+"</symbol>\n");
	dos.writeChars("<date d='"+date+"'>\n");
	dos.writeChars("<cap>"+cap+"</cap>\n");
	dos.writeChars("<low>"+low+"</low>\n");
	dos.writeChars("<open>"+open+"</open>\n");
	dos.writeChars("<high>"+high+"</high>\n");
	dos.writeChars("<close>"+close+"</close>\n");
	dos.writeChars("</date>\n");
    }

	catch(IOException e)
{
	e.printStackTrace();
}
	
}
return true;
	
}


    //A method to write real time data in xml format
    public boolean realtimexml(String symbol,long  cap, float low, float open, float high, float close)throws IOException
    {
    	String m=symbol;
    	System.out.println(m);
    	String fpath = null;
    	FileOutputStream fos = null; 	
        DataOutputStream dos = null;
        File xmlFile;
        fpath = "C:\\275\\outputDir\\snapshot-"+m+".xml";
        xmlFile = new File(fpath);

    	 
    if(!xmlFile.exists())
    { 	
    	try 
    {
    	
            fos = new FileOutputStream(xmlFile);
            dos=new DataOutputStream(fos);
    	
    		dos.writeChars("<?xml version=\'1.0\'>\n");
    		dos.writeChars("<Stock>\n");
    		dos.writeChars("<symbol>"+m+"</symbol>\n");
    		 
    		dos.writeChars("<cap>"+cap+"</cap>\n");
    		dos.writeChars("<low>"+low+"</low>\n");
    		dos.writeChars("<open>"+open+"</open>\n");
    		dos.writeChars("<high>"+high+"</high>\n");
    		dos.writeChars("<close>"+close+"</close>\n");
    		dos.writeChars("</date>\n");
    }
    	catch(IOException e)
    {
    	e.printStackTrace();
    }
    	}
    else
    {
    	try 
        {
        fos = new FileOutputStream(xmlFile, true);
        dos=new DataOutputStream(fos);
       	//dos.writeChars("<symbol>"+m+"</symbol>\n");
     
    	dos.writeChars("<cap>"+cap+"</cap>\n");
    	dos.writeChars("<low>"+low+"</low>\n");
    	dos.writeChars("<open>"+open+"</open>\n");
    	dos.writeChars("<high>"+high+"</high>\n");
    	dos.writeChars("<close>"+close+"</close>\n");
    	dos.writeChars("</date>\n");
        }

    	catch(IOException e)
    {
    	e.printStackTrace();
    }
    }

    dos.writeChars("</Stock>\n");
    return true;
    }
    //A method to write analyzed data in xml format

    public boolean analyzexml(String symbol,long  cap, float low, float open, float high, float close,String sdate)throws IOException
    {

        String m=symbol;
    	System.out.println(m);
    	String fpath = null;
    	FileOutputStream fos = null; 	
        DataOutputStream dos = null;
        File xmlFile;
        fpath = "C:\\275\\outputDir\\analyzed-"+sdate+".xml";
        xmlFile = new File(fpath);

    	 
    if(!xmlFile.exists())
    { 	
    	try 
    {
    	
            fos = new FileOutputStream(xmlFile);
            dos=new DataOutputStream(fos);
    	
    		dos.writeChars("<?xml version=\'1.0\'>\n");
    		dos.writeChars("<Stock>\n");
    		dos.writeChars("<symbol>"+m+"</symbol>\n");
    		dos.writeChars("<date d='"+sdate+"'>\n");
    		dos.writeChars("<cap>"+cap+"</cap>\n");
    		dos.writeChars("<low>"+low+"</low>\n");
    		dos.writeChars("<open>"+open+"</open>\n");
    		dos.writeChars("<high>"+high+"</high>\n");
    		dos.writeChars("<close>"+close+"</close>\n");
    		dos.writeChars("</date>\n");
    }
    	catch(IOException e)
    {
    	e.printStackTrace();
    }
    	}
    else
    {
    	try 
        {
        fos = new FileOutputStream(xmlFile, true);
        dos=new DataOutputStream(fos);
       	//dos.writeChars("<symbol>"+m+"</symbol>\n");
    	dos.writeChars("<date d='"+sdate+"'>\n");
    	dos.writeChars("<cap>"+cap+"</cap>\n");
    	dos.writeChars("<low>"+low+"</low>\n");
    	dos.writeChars("<open>"+open+"</open>\n");
    	dos.writeChars("<high>"+high+"</high>\n");
    	dos.writeChars("<close>"+close+"</close>\n");
    	dos.writeChars("</date>\n");
        }

    	catch(IOException e)
    {
    	e.printStackTrace();
    }
    	
    }
    return true;
    	
    }
    
		
    }
    
 
	 
    	

    	 
    	

    	

    	



 
