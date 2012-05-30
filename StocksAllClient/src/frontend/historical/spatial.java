package frontend.historical;

import com.foo.Client.StockProviderClient;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionSupport;
public class spatial extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String radioB;
	private String ticker;
	private String radio1;
	private String text1;
	private String text;
	
	 public String execute() throws Exception
	 { 
		 StockProviderClient sp=new StockProviderClient();
		 if(radio1.equalsIgnoreCase("historical"))
		 {
			 sp.gethistoricaldata(ticker, radioB);
		 }
		 else if(radio1.equalsIgnoreCase("snapshot"))
		 {
			 sp.getsnapshotdata(ticker, radioB, text, text1);
		 }
		 System.out.println(radioB);
		 System.out.println(ticker);
		 System.out.println(radio1);
		 System.out.println(text1);
		 System.out.println(text);
		 	System.out.println("Inside action historical xml....");
	      return "success";
	   } 
	 
	   public String getRadioB() {
	      return radioB;
	   }

	   public void setRadioB(String t) 
	   {
		   
	      this.radioB = t;
	     
	      
	   }
	   public void setTicker(String f)
	   {
		   this.ticker=f;
	   }
	   public String getTicker()
	   {
		   return ticker;
	   }
	   public String getRadio1() {
		      return radio1;
		   }

		   public void setRadio1(String r) 
		   {
			   
		      this.radio1 = r;
		     
		      
		   }
		   public String getText1() {
			      return text1;
			   }

			   public void setText1(String r) 
			   {
				   
			      this.text1 = r;
			     
			      
			   }
			   public String getText() {
				      return text;
				   }

				   public void setText(String r) 
				   {
					   
				      this.text = r;
				     
				      
				   }

}


