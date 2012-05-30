package com.foo.csv;
import javax.ejb.Remote;

@Remote
public interface WriteCsvRemote {
	public boolean historycsv(String symbol,long cap,float low, float open, float high,float close );
	 public boolean snapshotcsv(String symbol,long cap,float low, float open, float high,float close,String sdate,String edate );
	 public boolean analyzedcsv(String symbol,long cap,float low, float open, float high,float close,String sdate);

}
