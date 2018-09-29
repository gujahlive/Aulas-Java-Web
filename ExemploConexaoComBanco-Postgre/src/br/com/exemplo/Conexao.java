package br.com.exemplo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() {
		Connection con = null;
	 try {
				Class.forName("org.postgresql.Driver");
				con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/exemplo","postgres","jumpjet2");
				System.out.println("Conexao SUCESS!");
				
		} catch (SQLException e) {
			System.out.println("Erro - Conexao"+e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Erro - Driver"+e.getMessage());
		}
		
	
		return con;
		
	

}
}