package frontend.historical;
import com.foo.Client.StockSenderClient;
import com.opensymphony.xwork2.ActionSupport;
public class Uploadactiondata extends ActionSupport  {
	private static final long serialVersionUID = 1L;
	private String path;
	
	 public String execute() throws Exception 
	 {
		 StockSenderClient sc=new StockSenderClient();
		 sc.upload(path);
	      System.out.println("Inside action....");
	      return "success";
	   } 
	    
	 public String getPath() {
	return path;
	      
	   }

	   public void setPath(String p) {
	      this.path = p;
	   }


}
