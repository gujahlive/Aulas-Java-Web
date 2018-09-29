package br.com.exemplo.postgre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.ArrayList;
import br.com.exemplo.postagre.beans.Usuario;

public class UsuarioDAO {
	
	private Connection con = Conexao.getConnection();//gera a conexão com o banco
	
	public void cadastrar(Usuario usuario) {
		String sql = "INSERT INTO USUARIO(nome,email,senha) values(?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);//prepara a instacia com o sql
			preparador.setString(1, usuario.getNome());//indice que cada um representa, chama o objeto acessando o retorno do metodo
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			preparador.execute(); // executa o preparador para inserir
			preparador.close();//fecha o preparador
			System.out.println("Cadastrado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro: "+e.getMessage());
		}
	} 
	
	public void alterar(Usuario usuario) {
		String sql = "UPDATE USUARIO SET NOME = ?, EMAIL = ? ,SENHA = ? WHERE id = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);//prepara a instacia com o sql
			preparador.setString(1, usuario.getNome());//indice que cada um representa, chama o objeto acessando o retorno do metodo
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());//busca o id da table para alterar
			
			preparador.execute(); // executa o preparador para inserir
			preparador.close();//fecha o preparador
			System.out.println("Alterado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro: "+e.getMessage());
		}
	} 
	
	
	public void deletar(Usuario usuario) {
		String sql = "DELETE FROM USUARIO WHERE id=?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);//prepara a instacia com o sql
			preparador.setInt(1, usuario.getId());//busca o id da table para alterar
			
			preparador.execute(); // executa o preparador para inserir
			preparador.close();//fecha o preparador
			System.out.println("Deletado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro: "+e.getMessage());
		}
	} 
	
	public List<Usuario> buscarTodos(Usuario usuario){
		String sql = "SELECT * FROM USUARIO";
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();// executa os resultados
			while(resultados.next()) {
				Usuario user = new Usuario();
				user.setId(resultados.getInt("id"));
				user.setNome(resultados.getString("nome"));// passando o nome da table 
				user.setEmail(resultados.getString("email"));
				user.setSenha(resultados.getString("senha"));
				lista.add(user);//adciona a instancia criada no final do arraylist
				
			}
		} catch (SQLException e) {
			System.out.println("Erro - "+e.getMessage());
		}
		return lista;
		
	}
	
	public Usuario buscarporID(Integer id) {
		Usuario usuretorno = null;
		String sql = "select * from usuario where id = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);
			//retorno da consulta resultset
			ResultSet resultado = preparador.executeQuery();
			if(resultado.next()) {
				usuretorno = new Usuario();
				usuretorno.setId(resultado.getInt("id"));
				usuretorno.setNome(resultado.getString("nome"));
				usuretorno.setEmail(resultado.getString("email"));
				usuretorno.setSenha(resultado.getString("senha"));
			}
			System.out.println("Encontrado com sucesso! ");
		}catch(SQLException e) {
			System.out.println("Erro: de sql"+e.getMessage());
		}
		
		return usuretorno;
	}
	
	
	
}
