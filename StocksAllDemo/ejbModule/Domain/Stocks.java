package Domain;
import java.io.Serializable;
 
	/**
	 * This bean represents the Stocks entity
	 * Contains information of a stock
	 *
	 */
public class Stocks implements Serializable  
{
	private static final long serialVersionUID = 1L;	 
		public Stocks() 
		{
			
		}
		
		public Stocks(String date, String symbol, float open, float high, float low, float close, Long cap) {
		 
			this.date = date;
			this.symbol = symbol;
			this.open = open;
			this.close = close;
			this.high = high;
			this.low = low;
			this.cap = cap;
		}
		
		 
	 
		 

		 
		protected String date;
		
	 
		protected String symbol;
		
	 
		protected float open;
		
	 
		protected float high;
		
		 
		protected float low;
		
		 
		protected float close;
		
		 
		protected Long cap;

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public float getOpen() {
			return open;
		}

		public void setOpen(float open) {
			this.open = open;
		}

		public float getHigh() {
			return high;
		}

		public void setHigh(float high) {
			this.high = high;
		}

		public float getLow() {
			return low;
		}

		public void setLow(float low) {
			this.low = low;
		}

		public float getClose() {
			return close;
		}

		public void setClose(float close) {
			this.close = close;
		}
		
		public Long getCap() {
			return cap;
		}

		public void setCap(Long cap) {
			this.cap = cap;
		}
		
		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol)
		{
			this.symbol = symbol;
		}
	}


