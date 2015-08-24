package sysblo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*** 1 ***/
@WebServlet("/")
public class ListenerSarvlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException{

		/*** 2 ***/
		ServletContext context = this.getServletContext();

		/*** 3 ***/
		req.setAttribute("msg", context.getAttribute("msg"));

		RequestDispatcher dis = req.getRequestDispatcher("/view/SampleListener.jsp");

		dis.forward(req, res);

	}

}
