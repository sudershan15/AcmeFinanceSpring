package com.foo.jsonparser;
import javax.ejb.Remote;

@Remote
public interface jsonparserRemote {
	public boolean historyjson(String symbol,long cap,float low, float open, float high,float close);
	public boolean snapshotjson(String symbol,long cap,float low, float open, float high,float close,String sdate,String edate);
	public boolean analyzedjson(String symbol,long cap,float low, float open, float high,float close,String sdate);

}
