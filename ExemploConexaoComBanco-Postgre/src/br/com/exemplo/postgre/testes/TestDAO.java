package br.com.exemplo.postgre.testes;

import java.util.List;
import java.util.ArrayList;
import br.com.exemplo.postagre.beans.Usuario;
import br.com.exemplo.postgre.UsuarioDAO;

public class TestDAO {
	
	public static void main(String[] args) {
		//testCadastrar();
		//testAlterar();
		//testDeletar();
		testListar();
		
	}
	
	public static void testCadastrar() {
		Usuario user = new Usuario();
		user.setNome("john");
		user.setEmail("john@guga.com");
		user.setSenha("12345");
		
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.cadastrar(user);
				
		
	}
	public static void testAlterar() {
		Usuario user = new Usuario();
		user.setNome("guguinh");
		user.setEmail("gu@guga.com");
		user.setSenha("1234");
		user.setId(1);
		
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.alterar(user);
				
		
	}
	
	public static void testDeletar() {
		Usuario user = new Usuario();
		user.setId(1);
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.deletar(user);
				
		
	}
	public static void testListar() {
		Usuario user = new Usuario();
		UsuarioDAO userDAO = new UsuarioDAO();
		List<Usuario> listaResult = userDAO.buscarTodos(user);
		for(Usuario u : listaResult) {
			System.out.println("id: "+u.getId()+"nome: "+u.getNome()+"email: "+u.getEmail()+"senha: "+u.getSenha());//u é a variavel do for que compara com o resultado da lista
		}
	}
}
