package com.foo.Stocks;

import javax.ejb.Stateless;
 

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

 

import Domain.*;
import DAO.*;

/**
 * Session Bean implementation class StockProvider
 */
@Stateless
public class StockProvider implements StockProviderRemote, StockProviderLocal {

    /**
     * Default constructor. 
     */
    public StockProvider() 
    {
        // TODO Auto-generated constructor stub
    }
 public List<Stocks> getstocks(String sym)
    	{
    		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 
    		StocksDAO stocks = (StocksDAO) context.getBean("stocksDAOProxy");
		 
    		List<Stocks> s =stocks.getStocks(sym);
	         
	        return s;
	     }
public List<Stocks> getstocksbydaterange(String sym,String sdate,String edate)
    	{
    		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 
    		StocksDAO stocks = (StocksDAO) context.getBean("stocksDAOProxy");
		 
    		List<Stocks> s =stocks.getStocksByDateRange(sym, sdate, edate);
	         
    		return s;
	     }
public List<Stocks> getstocksbydate(String date)
    	{
    		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 
    		StocksDAO stocks = (StocksDAO) context.getBean("stocksDAOProxy");
		 
    		List<Stocks> s =stocks.getStocksByDate(date);
	        return s;
	     }
public List<Stocks> gettopstocks(String date)
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 
    		StocksDAO stocks = (StocksDAO) context.getBean("stocksDAOProxy");
		 
    		List<Stocks> s =stocks.getTopStocksByCap(date);
	         
	         return s;
	  }
}
