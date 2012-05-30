package frontend.historical;



 

import java.util.*;

import com.foo.Client.StockProviderClient;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String intercept(ActionInvocation invocation)throws Exception{

      /* let us do some pre-processing */
      String output = "Pre-Processing"; 
      System.out.println(output);

      /* let us call action or next interceptor */
      String result = invocation.invoke();
     

      /* let us do some post-processing */
      output = "Post-Processing"; 
      System.out.println(output);

      return result;

   }
}



