package frontend.historical;
import com.foo.Client.StockProviderClient2;
import com.opensymphony.xwork2.ActionSupport;
public class historicalxml  extends ActionSupport 
{
	private static final long serialVersionUID = 1L;
	private String name;
	private String submit;
	
	 public String execute() throws Exception
	 { 
		 StockProviderClient2 sp=new StockProviderClient2();
		 sp.gethistoricaldata(name,submit);
		 
		 System.out.println("Inside action historical xml....");
	      return "success";
	   } 
	 
	
	 
	   public String getName() {
	      return name;
	   }

	   public void setName(String ticker) 
	   {
	      this.name = ticker;
	     
	      
	   }
	   public void setSubmit(String format)
	   {
		   this.submit=format;
	   }
	   public String getSubmit()
	   {
		   return submit;
	   }

}
