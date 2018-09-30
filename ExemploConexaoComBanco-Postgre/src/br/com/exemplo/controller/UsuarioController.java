package br.com.exemplo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import br.com.exemplo.postagre.beans.Usuario;
import br.com.exemplo.postgre.UsuarioDAO;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = new Usuario();
		
		UsuarioDAO userDAO = new UsuarioDAO();
		String acao = request.getParameter("acao");
		if(acao!=null && acao.equals("listar")) {
		List<Usuario> lista = userDAO.buscarTodos(user);
		request.setAttribute("lista", lista);
		
		RequestDispatcher saida = request.getRequestDispatcher("listaUsuarios.jsp");//direciona para a pagina 
		saida.forward(request, response);
		}else if(acao!=null && acao.equals("delete")) {
			String id = request.getParameter("id");
			user.setId(Integer.parseInt(id));
			userDAO.deletar(user);
			response.sendRedirect("UsuarioController?acao=listar");
		}else if(acao!=null && acao.equals("editar")) {
			String id = request.getParameter("id");
			Usuario usuario = userDAO.buscarporID(Integer.parseInt(id)); 
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("EditarUser.jsp").forward(request, response);
			
			//user.setId(Integer.parseInt(id));
			//userDAO.alterar(user);
			//response.sendRedirect("UsuarioController?acao=listar");
		}else if(acao!=null && acao.equals("cadastrar")) {
			RequestDispatcher saida = request.getRequestDispatcher("cadastro.jsp");//direciona para a pagina 
			saida.forward(request, response);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///doGet(request, response);
		//Pegando os valores da tela, no caso o id n deveria estar ai
		String sid = request.getParameter("id");
		String snome = request.getParameter("nome");
		String semail = request.getParameter("email");
		String ssenha = request.getParameter("senha");
		String sdatainscricao = request.getParameter("datainscricao");
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(format.parse(sdatainscricao).getTime());
			
		
		
		// criando objeto usuario e atribuindo nos novos valores que foram pegos na tela
		Usuario user = new Usuario();
		user.setNome(snome);
		user.setEmail(semail);
		user.setSenha(ssenha);
		user.setDatainscricao(data);
		user.setId(Integer.parseInt(sid));//só vou deixar aqui pra mostrar como faz o cast
		//Cria o usuário DAO, que é a conexão com o banco
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.alterar(user);// associa o usuario alterado ao usuario do banco alterando ele
		//PrintWriter out = response.getWriter();
		response.sendRedirect("UsuarioController?acao=listar");
			
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			System.out.print("Erro na data -"+e.getMessage());
		}
		
		
	}

}
