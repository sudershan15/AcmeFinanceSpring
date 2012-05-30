package com.foo.Stocks;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

import DAO.StocksDAO;

import Domain.*;

/**
 * Message-Driven Bean implementation class for: StockRecorder
 *
 */
@MessageDriven(
		activationConfig = { 
				@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
				@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/MyQueue")})
public class StockRecorder implements MessageListener {

	@Resource // used for rollback of the message in case of any inconsistency. 
	MessageDrivenContext mdc;
	
  
	Stocks stocks=null;
    /**
     * Default constructor. 
     */
    public StockRecorder()
    {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) 
    {
        // TODO Auto-generated method stub
    	try{
    		TextMessage msg = (TextMessage) message;
    		// The message is extracted and split based on the comma delimiter
    		String[] data = msg.getText().split(",");
    		 
    		
    		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    		StocksDAO forumDAO = (StocksDAO) context.getBean("stocksDAO");
    		Stocks stocks = new Stocks(data[0],data[1], Float.parseFloat(data[2]),Float.parseFloat(data[3]),Float.parseFloat(data[4]),Float.parseFloat(data[5]),Long.parseLong(data[6]));
    		forumDAO.insertForum(stocks);	
    		
    		 
    	}
    	catch(Exception e)
    	{
    		// Rollback the message bean in case of exception.
    		mdc.setRollbackOnly();
    	}
        
        
    }

}
