package com.foo.jsonparser;
import java.io.*;


import org.apache.tomcat.util.json.JSONException;
import org.apache.tomcat.util.json.JSONObject;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class jsonparser
 */
@Stateless
public class jsonparser implements jsonparserRemote, jsonparserLocal {

    /**
     * Default constructor. 
     */
    public jsonparser() {
        // TODO Auto-generated constructor stub
    }
   


     
    //A method to create historical file for analyzed data
    public boolean historyjson(String symbol,long cap,float low, float open, float high,float close)
    {
    	try {
    				String filename=symbol;
    				String vol=String.valueOf(cap);
    				String l=String.valueOf(low);
    				String o=String.valueOf(open);
    				String h=String.valueOf(high);
    				String c=String.valueOf(close);
    				JSONObject object=new JSONObject();
    	try {
    		 		File jsonFile;
    		 		FileOutputStream fos; 
    			    DataOutputStream dos;
    			    jsonFile = new File("C:\\275\\outputDir\\history"+filename+".txt");
    				if(!jsonFile.exists())
    								{
    					   						fos = new FileOutputStream(jsonFile);
    					   						dos=new DataOutputStream(fos);
    					   						object.put("symbol", filename);
    					   						object.put("cap", vol);
    					   						object.put("low", l);
    					   						object.put("open", o);
    					   						object.put("high", h);
    					   						object.put("close", c);
    					   						String jsonstring=object.toString();
    					   						dos.writeChars(jsonstring);
    					   						System.out.println(jsonstring);
    				 					}
    				else
    									{
    											fos = new FileOutputStream(jsonFile,true);
    											dos=new DataOutputStream(fos);
    											object.put("symbol", filename);
    											object.put("cap", vol);
    											object.put("low", l);
    											object.put("open", o);
    											object.put("high", h);
    											object.put("close", c);
    											String jsonstring=object.toString();
    											dos.writeChars(jsonstring);
    											System.out.println(jsonstring);
    									}
    		}
    					
    		catch (IOException e) 
    				 {
    					// TODO Auto-generated catch block
    						e.printStackTrace();
    				 }
    					
    		}
    		catch (JSONException e1) 
    				{
    					// TODO Auto-generated catch block
    						e1.printStackTrace();
    				}
		return true;
    	}
    	
    //A method to create json file for snapshot data
    public boolean snapshotjson(String symbol,long cap,float low, float open, float high,float close,String sdate,String edate)
    {
    try{
    	String filename=symbol;
		String vol=String.valueOf(cap);
		String l=String.valueOf(low);
		String o=String.valueOf(open);
		String h=String.valueOf(high);
		String c=String.valueOf(close);
		JSONObject object=new JSONObject();
    				 
    	try{
    		File jsonFile;
	 		FileOutputStream fos; 
		    DataOutputStream dos;
    				jsonFile = new File("C:\\275\\outputDir\\snapshot"+filename+".txt");
    		if(!jsonFile.exists()){
    			fos = new FileOutputStream(jsonFile);
					dos=new DataOutputStream(fos);
    									object.put("symbol", symbol);
    									object.put("cap", cap);
    									object.put("low", low);
    									object.put("open", open);
    									object.put("high", high);
    									object.put("close", close);
    									object.put("startdate", sdate);
    									object.put("enddate", edate);
    									String jsonstring=object.toString();
    									 
    									 
    									dos.writeChars(jsonstring);
    									System.out.println(jsonstring);
    								}
    				 
    					else{
    							fos = new FileOutputStream(jsonFile,true);
    							dos=new DataOutputStream(fos);
    									object.put("symbol", symbol);
    									object.put("cap", cap);
    									object.put("low", low);
    									object.put("open", open);
    									object.put("high", high);
    									object.put("close", close);
    									object.put("startdate", sdate);
    									object.put("enddate", edate);
    									String jsonstring=object.toString();
    									dos.writeChars(jsonstring);	
    									 
    									System.out.println(jsonstring);
    						}
    			}
    			catch (IOException e) 
    									{
    										// TODO Auto-generated catch block
    										e.printStackTrace();
    									}
    }  
    	     catch (JSONException e) 
    	     							{
    	    	 							// TODO Auto-generated catch block
    	    	 							e.printStackTrace();
    	     							}
	return true;
    }
    //A method to create json file for analyzed data	
    public boolean analyzedjson(String symbol,long cap,float low, float open, float high,float close,String sdate)
    {
    	try
    {
    		String filename=sdate;
    		String vol=String.valueOf(cap);
    		String l=String.valueOf(low);
    		String o=String.valueOf(open);
    		String h=String.valueOf(high);
    		String c=String.valueOf(close);
    		JSONObject object=new JSONObject();
    				 
    			try
    					{
    				File jsonFile;
    		 		FileOutputStream fos; 
    			    DataOutputStream dos;
    		 				jsonFile = new File("C:\\275\\outputDir\\analyzed"+filename+".txt");
    		 				if(!jsonFile.exists()) {
    		 					fos = new FileOutputStream(jsonFile);
    						dos=new DataOutputStream(fos);
    		 											object.put("symbol", symbol);
    		 											object.put("cap", cap);
    		 											object.put("low", low);
    		 											object.put("open", open);
    		 											object.put("high", high);
    		 											object.put("close", close);
    		 											String jsonstring=object.toString();
    		 											dos.writeChars(jsonstring);	
    		 											System.out.println(jsonstring);
    				                                }
    		 				else
    		 										{
    					 
    		 					fos = new FileOutputStream(jsonFile,true);
    							dos=new DataOutputStream(fos);
    		 											object.put("symbol", symbol);
    		 											object.put("cap", cap);
    		 											object.put("low", low);
    		 											object.put("open", open);
    		 											object.put("high", high);
    		 											object.put("close", close);
    		 											String jsonstring=object.toString();
    		 											dos.writeChars(jsonstring);	
    		 											 
    		 											System.out.println(jsonstring);
    						                         }
    	                  }
    			         catch (IOException e) 
    						 {
    									// TODO Auto-generated catch block
    			        	 			e.printStackTrace();
    						 }
    		}  
    	      
    	       
    		catch (JSONException e) 
    			{
    			// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
		return true;
        
            }

    }
    	 




