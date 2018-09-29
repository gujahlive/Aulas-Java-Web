package br.com.calc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcBasic
 */
@WebServlet("/CalcBasic")
public class CalcBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcBasic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");//seta o tipo do componente
		PrintWriter out = response.getWriter();//importa uma classe chamada PrintWiter que é a saida de txt
		
		String svalorA = request.getParameter("valorA");
		String svalorB = request.getParameter("valorB");
		String sopcao = request.getParameter("opcao");
		
		double dvalorA = Double.parseDouble(svalorA);
		double dvalorB = Double.parseDouble(svalorB);
		double result = 0;
		
		if(sopcao.equals("+")) {
			result = dvalorA + dvalorB;
		}
		if(sopcao.equals("-")) {
			result = dvalorA - dvalorB;
		}
		if(sopcao.equals("*")) {
			result = dvalorA * dvalorB;
		}
		if(sopcao.equals("/")) {
			result = dvalorA / dvalorB;
		}
		out.print("Resutado<br/>"+result);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
