package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao
{

	public Connection getConnection() throws SQLException { //OK
		return DriverManager.getConnection("jdbc:mysql://localhost/doacao","root","123");
	}
}