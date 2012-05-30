package com.foo.Stocks;
import java.util.List;

import javax.ejb.Local;

import Domain.Stocks;

@Local
public interface StockProviderLocal
{
	public List<Stocks> getstocks(String sym);
	public List<Stocks> getstocksbydaterange(String sym,String sdate,String edate);
	public List<Stocks> getstocksbydate(String date);
	public List<Stocks> gettopstocks(String date);
}
