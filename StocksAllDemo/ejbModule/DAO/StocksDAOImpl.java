package DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

 
import Domain.*;

//public class StocksDAOImpl extends JdbcDaoSupport  implements StocksDAO 
public class StocksDAOImpl implements StocksDAO 
{
	 
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) 
	{
	    this. jdbcTemplate = new  JdbcTemplate(dataSource);
	}

	public void insertForum(Stocks s) {
		String query = "INSERT INTO stocks (date,symbol,close,high,low,open,cap) VALUES (?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, new Object[] {s.getDate(),s.getSymbol(),s.getClose(),s.getHigh(),s.getLow(),s.getOpen(),s.getCap()});
	}

	public List<Stocks> getStocks(String symbol){
		String sql="select * from stocks where symbol=?";
		List<Stocks> stocks= new ArrayList<Stocks>();
		List<Map> rows =jdbcTemplate.queryForList(sql, new Object[] {  String.valueOf(symbol) });
		for (Map row : rows) {
			Stocks s = new Stocks((String)row.get("date"),(String)row.get("symbol"),(Float)row.get("close"),(Float)row.get("high"),(Float)row.get("open"),(Float)row.get("low"),(Long)row.get("cap"));
			stocks.add(s);
		}
		return stocks;
	}
	//historical data
	public List<Stocks> getStocksByDateRange(String symbol, String startDate, String endDate){
		String sql="select * from stocks where symbol=? and date between ? and ?";
		List<Stocks> stocks= new ArrayList<Stocks>();
		List<Map> rows =jdbcTemplate.queryForList(sql, new Object[] {  String.valueOf(symbol), Integer.valueOf(startDate), Integer.valueOf(endDate) });
		for (Map row : rows) {
			Stocks s = new Stocks((String)row.get("date"),(String)row.get("symbol"),(Float)row.get("close"),(Float)row.get("high"),(Float)row.get("open"),(Float)row.get("low"),(Long)row.get("cap"));
			stocks.add(s);
		}
		return stocks;
	}
	//real time data
	public List<Stocks> getStocksByDate(String date){ 
		String sql="select * from stocks where date=?";
		List<Stocks> stocks= new ArrayList<Stocks>();
		List<Map> rows =jdbcTemplate.queryForList(sql, new Object[] {  String.valueOf(date) });
		for (Map row : rows){
			Stocks s = new Stocks((String)row.get("date"),(String)row.get("symbol"),(Float)row.get("close"),(Float)row.get("high"),(Float)row.get("open"),(Float)row.get("low"),(Long)row.get("cap"));
			stocks.add(s);
		}
		return stocks;
	}
	//analyzed data
	public List<Stocks> getTopStocksByCap(String date){
		String sql="select * from stocks where date =? order by cap desc limit 5";
		List<Stocks> stocks= new ArrayList<Stocks>();
		List<Map> rows =jdbcTemplate.queryForList(sql,new Object[] {  String.valueOf(date) });
		for (Map row : rows) {
			Stocks s = new Stocks((String)row.get("date"),(String)row.get("symbol"),(Float)row.get("close"),(Float)row.get("high"),(Float)row.get("open"),(Float)row.get("low"),(Long)row.get("cap"));
			stocks.add(s);
		}
		return stocks;
	}
}
