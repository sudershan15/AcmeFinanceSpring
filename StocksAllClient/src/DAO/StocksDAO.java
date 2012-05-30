package DAO;

 import java.util.List;

 

import Domain.*;

public interface StocksDAO 
{
	public void insertForum(Stocks forum);
	public List<Stocks> getStocks(String symbol);
	public List<Stocks> getStocksByDateRange(String symbol, String startDate, String endDate);
	public List<Stocks> getStocksByDate(String date);
	public List<Stocks> getTopStocksByCap(String date);
}
