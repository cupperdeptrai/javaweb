package DoAnhHoang.vn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HomeServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/_home.jsp");
		dispatcher.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
		doGet(request, response);
	}
}
