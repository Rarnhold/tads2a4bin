package br.univel.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

/*Toda Chamada ligada a conexão possui o nome Inicia com cnx + função
 *	cnxAbrir 
 *	cnxFechar
 */

public class ClienteDaoH2Impl implements ClienteDao {

	private static Connection con;

	private Connection ClienteDaoH2Impl() throws SQLException {
		// Falta implementar o synchronized

		if (con == null) {
			cnxAbrir();
		}
		return con;
	}

	private void cnxAbrir() {
		String url = "jdbc:h2:./tads4bin";
		String user = "sa";
		String password = "sa";

		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão estabelecida");
		
		} catch (SQLException e) {
			System.out.println("Falha na Conexão Com o banco de dados: "+e.getMessage());
		}
	}

	public void inserir(Cliente c) {
		// TODO Auto-generated method stub

	}

	public void atualizar(Cliente c) {
		// TODO Auto-generated method stub

	}

	public void excluir(Cliente c) {
		// TODO Auto-generated method stub

	}

	public void buscar(Cliente c) {
		// TODO Auto-generated method stub

	}

	public Cliente buscaPorExcemplo(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	// Teste de conexão com banco de dados
	public static void main(String[] args) throws SQLException {
		ClienteDaoH2Impl c = new ClienteDaoH2Impl();
		c.ClienteDaoH2Impl();
	}
}
