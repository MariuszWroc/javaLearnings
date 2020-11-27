package jdbc;

import static jdbc.MysqlProperties.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DatabaseConnector {
	private static Logger LOGGER = Logger.getLogger(DatabaseConnector.class.getName());

	private DatabaseConnector() {
	}

	public static Connection getDBConnection() {
		Connection dbConnection = null;

		try {
			Class.forName(DB_DRIVER.getValue());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.WARNING, "Driver not found. " + e.getMessage(), e);
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION.getValue(), DB_USER.getValue(),
					DB_PASSWORD.getValue());
		} catch (SQLException e) {
			LOGGER.log(Level.WARNING, "Can't make connection with database. " + e.getMessage(), e);
		}

		return dbConnection;
	}
}
