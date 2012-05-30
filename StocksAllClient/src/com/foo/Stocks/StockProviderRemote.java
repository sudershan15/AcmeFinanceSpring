package com.foo.Stocks;
import java.util.List;

import javax.ejb.Remote;

import Domain.Stocks;

@Remote
public interface StockProviderRemote 
{
	public List<Stocks> getstocks(String sym);
	public List<Stocks> getstocksbydaterange(String sym,String sdate,String edate);
	public List<Stocks> getstocksbydate(String date);
	public List<Stocks> gettopstocks(String date);
}
