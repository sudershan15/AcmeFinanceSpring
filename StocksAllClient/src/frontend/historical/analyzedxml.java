package frontend.historical;
import com.foo.Client.StockProviderClient2;
import com.opensymphony.xwork2.ActionSupport;
public class analyzedxml  extends ActionSupport 
{
	private static final long serialVersionUID = 1L;
	 
	private String submit;
	private String text;
	 public String execute() throws Exception
	 { 
		 StockProviderClient2 sp=new StockProviderClient2();
		  sp.getanalyzedata(text, submit);
		 	System.out.println("Inside action historical xml....");
	      return "success";
	   } 
	 
	  
	   public void setSubmit(String format)
	   {
		   this.submit=format;
	   }
	   public String getText() {
		return text;
	}


	public void setText(String date) {
		this.text = date;
	}


	public String getSubmit()
	   {
		   return submit;
	   }

}
