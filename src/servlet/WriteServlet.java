package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoClient;
import model.Client;
import model.CompteCourant;
import model.CompteEpargne;
import service.ServiceProxiSI;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/WriteServlet")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	//
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WriteServlet() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String mess2 = request.getParameter("inputmess2");
		response.setContentType("text/html;charset=UTF-8");


		final PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Interface Client</title>");
			out.println("</head>");
			out.println("<br>");
			out.println("<div align='center'>");
			out.println("<h2>INTERFACE PROXIBANQUE WRITE</h2>");
			out.println("entrer un iD Client pour consulter");
			out.println("<br><br><br>");
			out.println("<form action='DisplayServlet' method='POST'>");
			out.println("<input type='submit' value='enter'>");
			out.println("<input type='text'  name='inputmess'> ");
			out.println("</form>");
			out.println("<br>");


			out.println("</div>");
			out.println("</body>");
			out.println("</html>");

		}
		
		finally {
			out.close();
		}
		System.out.println("DANS WRITESERVLET ********************************************");
		
	}
}
