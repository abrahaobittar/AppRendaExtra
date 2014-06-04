package testes;

import java.sql.SQLException;

import persistencia.Conexao;

public class TesteConexao
{

	
	public static void main(String[] args) {
		try {
			Conexao con = new Conexao();
			con.getConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}

