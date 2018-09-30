package br.com.exemplo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.exemplo.postagre.beans.Usuario;
import br.com.exemplo.postgre.UsuarioDAO;

/**
 * Servlet implementation class autenticador
 */
@WebServlet("/autenticador")
public class autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autenticador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession sessao = request.getSession(false);
		if(sessao!= null) {
			sessao.invalidate();
		}
		response.sendRedirect("login.jsp");///redireciona, posso colocar no index
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario user = new Usuario();
		user.setEmail(email);
		user.setSenha(senha);
		
		UsuarioDAO userDAO = new UsuarioDAO();
		Usuario userAutenticado  = userDAO.autenticacao(user);
		if(userAutenticado != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("userAutenticado", userAutenticado);
			//sessao.setMaxInactiveInterval(3000);//seta o tempo maximo que o usuario vai poder ficar conectado
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			response.sendRedirect("erroLogin.jsp");
		}
		
		
	}

}
