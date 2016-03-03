import java.sql.*;
//import oracle.jdbc.*;

public class Database
{
	public static void main(String[] args) throws SQLException{
		String dbName = "NBGardens2";
		Connection conn = getConnection.getConn();
		StockManager.addStock(conn, dbName);
		getConnection.closeConn(conn);
	}
}