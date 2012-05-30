package com.foo.xml;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.ejb.Local;

@Local
public interface ToXmlLocal {
	 public boolean historyxml(String date, String symbol,long  cap, float low, float open, float high, float close) throws IOException;
	 public boolean snapshotxml(String symbol, long  cap, float low, float open, float high, float close,String date)throws IOException;
	 public boolean realtimexml(  String symbol,long  cap, float low, float open, float high, float close)throws IOException;
	 public boolean analyzexml(String symbol,long  cap, float low, float open, float high, float close,String sdate)throws IOException;
}
