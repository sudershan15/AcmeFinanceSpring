package com.foo.Client;
 
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import com.foo.Stocks.*; 
import com.foo.xml.*;
import com.foo.csv.*;
import com.foo.jsonparser.*;
import Domain.*;
public class StockProviderClient2 
{
	static StockProviderRemote svr;
	static ToXmlRemote t;
	static WriteCsvRemote v;
	static jsonparserRemote j;
	public boolean gethistoricaldata(String ticker,String dataformat) 
	{
				String m=ticker;
				System.out.println(m);
				String format=dataformat;
				System.out.println(format);
				 
	try 
	{
				Properties properties = new Properties();
				properties.put(Context.PROVIDER_URL, "jnp://localhost:1099");
				properties.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
				properties.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
				Context ctx = new InitialContext(properties);
				Object ref = ctx.lookup("StockProvider/remote");
				Object ref1 = ctx.lookup("ToXml/remote");
				Object ref2 = ctx.lookup("WriteCsv/remote");
				Object ref3 = ctx.lookup("jsonparser/remote");
				svr = (StockProviderRemote) PortableRemoteObject.narrow(ref, StockProviderRemote.class);
				t= (ToXmlRemote) PortableRemoteObject.narrow(ref1, ToXmlRemote.class);
				v= (WriteCsvRemote) PortableRemoteObject.narrow(ref2, WriteCsvRemote.class);
				j= (jsonparserRemote) PortableRemoteObject.narrow(ref3, jsonparserRemote.class);
				List<Stocks> data = svr.getstocks(m);
				
					 
				for (Stocks d : data)  
				{
				    String symbol=d.getSymbol();
					float low=d.getLow();
					long cap=d.getCap();
					float open=d.getOpen();
					float close=d.getClose();
					float high=d.getHigh();
					String date=d.getDate();
					if(format.equalsIgnoreCase("xml"))
					{
					t.historyxml(date, symbol, cap, low, open, high, close);
				 
				 
				}
				
				else if(format.equalsIgnoreCase("csv"))
				{
					v.historycsv(symbol, cap, low, open, high, close);
				}
				else if(format.equalsIgnoreCase("json"))
				{
					j.historyjson(symbol, cap, low, open, high, close);
				}
				}
				System.out.println("-----");
	}
	 
				catch (Exception e) 
				{
				e.printStackTrace();
				}
	return true;
		}
	public boolean getsnapshotdata(String ticker,String dataformat,String startdate,String enddate) 
	{
				String m=ticker;
				String format=dataformat;
				String sdate=startdate;
				String edate=enddate;
				
		try 
			{
				Properties properties = new Properties();
				properties.put(Context.PROVIDER_URL, "jnp://localhost:1099");
				properties.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
				properties.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
				Context ctx = new InitialContext(properties);
				Object ref = ctx.lookup("StockProvider/remote");
				Object ref1 = ctx.lookup("ToXml/remote");
				Object ref2 = ctx.lookup("WriteCsv/remote");
				Object ref3 = ctx.lookup("jsonparser/remote");
				svr = (StockProviderRemote) PortableRemoteObject.narrow(ref, StockProviderRemote.class);
				t= (ToXmlRemote) PortableRemoteObject.narrow(ref1, ToXmlRemote.class);
				v= (WriteCsvRemote) PortableRemoteObject.narrow(ref2, WriteCsvRemote.class);
				j= (jsonparserRemote) PortableRemoteObject.narrow(ref3, jsonparserRemote.class);
				System.out.println("getSTocksByDateRange: " + m + ", " + sdate + ", " + edate  );
				List<Stocks> data = svr.getstocksbydaterange(m,sdate,edate);
				
					for (Stocks d :data)  
					{
					    String symbol=d.getSymbol();
						float low=d.getLow();
						long cap=d.getCap();
						float open=d.getOpen();
						float close=d.getClose();
						float high=d.getHigh();
						String date=d.getDate();
						if(format.equalsIgnoreCase("xml"))
						{
						  
						t.snapshotxml(symbol, cap, low, open, high, close, date);
						}
						else if(format.equalsIgnoreCase("csv"))
						{
							v.snapshotcsv(symbol, cap, low, open, high, close, sdate, edate);
						}
						else if(format.equalsIgnoreCase("json"))
						{
							j.snapshotjson(symbol, cap, low, open, high, close, sdate, edate);					}
		
					System.out.println("-----");
		}
			}
		 
					catch (Exception e) 
					{
					e.printStackTrace();
					}
		return true;
			
	}
	
	
public boolean getanalyzedata(String ndate, String dataformat){
		String format=dataformat;
		String sdate=ndate;
		 
try {
		Properties properties = new Properties();
		properties.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		properties.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
		properties.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
		Context ctx = new InitialContext(properties);
		Object ref = ctx.lookup("StockProvider/remote");
		Object ref1 = ctx.lookup("ToXml/remote");
		Object ref2 = ctx.lookup("WriteCsv/remote");
		Object ref3 = ctx.lookup("jsonparser/remote");
		svr = (StockProviderRemote) PortableRemoteObject.narrow(ref, StockProviderRemote.class);
		t= (ToXmlRemote) PortableRemoteObject.narrow(ref1, ToXmlRemote.class);
		v= (WriteCsvRemote) PortableRemoteObject.narrow(ref2, WriteCsvRemote.class);
		j= (jsonparserRemote) PortableRemoteObject.narrow(ref3, jsonparserRemote.class);
		System.out.println("getTopStocksByCap: " + sdate  );
		List<Stocks> data = svr.gettopstocks(sdate);
		
			 
			  
				for (Stocks d : data)  
				{
				    String symbol=d.getSymbol();
					float low=d.getLow();
					long cap=d.getCap();
					float open=d.getOpen();
					float close=d.getClose();
					float high=d.getHigh();
					String date=d.getDate();
					System.out.println(symbol );
					if(format.equalsIgnoreCase("xml"))
					{
					t.analyzexml(symbol, cap, low, open, high, close,sdate);
				 
				
				}
					else if(format.equalsIgnoreCase("csv"))
						
					{
						v.analyzedcsv(symbol, cap, low, open, high, close, sdate);
					}
					else if(format.equalsIgnoreCase("json"))
					{
						j.analyzedjson(symbol, cap, low, open, high, close, sdate);		
					}
	
				System.out.println("-----");
	}
}
		
	 
				catch (Exception e) 
				{
				e.printStackTrace();
				}
return true;
		
}
		
	
		 

	public static void main(String[] args)
	{
 
		StockProviderClient2 s=new StockProviderClient2();
		//s.gethistoricaldata("A", "xml");
		//s.gethistoricaldata("A", "json");
		//s.gethistoricaldata("A", "csv");
		//s.getsnapshotdata("A","xml", "20090209", "20100518");
		//s.getsnapshotdata("A","json", "20090209", "20100518");
		//s.getsnapshotdata("A","csv", "20090209", "20100518");
		//s.getanalyzedata("20100518", "json");
		//s.getanalyzedata("20100518", "xml");
		//s.getanalyzedata("20100518", "csv");
		 
	}
}
