package frontend.historical;
import com.foo.Client.StockProviderClient2;
import com.opensymphony.xwork2.ActionSupport;
public class snapshotxml  extends ActionSupport 
{
	private static final long serialVersionUID = 1L;
	private String name;
	private String text;
	private String text1;
	private String submit;
	
	 public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String enddate) {
		this.text1 = enddate;
	}

	public String getText() {
		return text;
	}

	public void setText(String startdate) {
		this.text = startdate;
	}

	public String execute() throws Exception
	 { 
		  System.out.println(name);
		  System.out.println(submit);
		  System.out.println(text);
		  System.out.println(text1);
		  StockProviderClient2 sp=new StockProviderClient2();
		  sp.getsnapshotdata(name, submit, text, text1);
		 	System.out.println("Inside action snapshot xml....");
	      return "success";
	   } 
	 
	   public String getName() {
	      return name;
	   }

	   public void setName(String ticker) 
	   {
	      this.name = ticker;
	     
	      
	   }

}
