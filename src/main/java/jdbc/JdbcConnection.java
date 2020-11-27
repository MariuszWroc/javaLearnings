package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcConnection {
	private static Logger LOGGER = Logger.getLogger(JdbcConnection.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void execute() {
		try {
			Connection dbConnection = DatabaseConnector.getDBConnection();
			DataAccess dataAccess = new DataAccess(dbConnection);
			List<String> selectQueries = null;//queryStrategy.readyFrom();
			String columnName= "";
			dataAccess.read(selectQueries, columnName);
			dataAccess.closeConnection();
		} catch (SQLException e) {
			LOGGER.log(Level.WARNING, "Driver not found. " + e.getMessage(), e);
		}
	}

}
