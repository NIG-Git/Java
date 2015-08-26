package sysblo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*** 1 ***/
@WebServlet("/")
public class SessionCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException{

		/*** 2 ***/
		HttpSession session = req.getSession(false);

		if(session == null){
			session = req.getSession(true);
		}

		session.setMaxInactiveInterval(30);

		/*** 3 ***/
		Cookie[] cookie = req.getCookies();

		int pageCount = 0;

		String cookieSessionID = "";

		if(cookie != null){

			Cookie countCookie = null;

			for(int i = 0; i < cookie.length; i++){

				if(cookie[i].getName().equals("pageCount")){

					cookie[i].setValue(String.valueOf(Integer.parseInt(cookie[i].getValue()) + 1));
					pageCount = Integer.parseInt(cookie[i].getValue());
					countCookie = cookie[i];
					res.addCookie(countCookie);

				}else if(cookie[i].getName().equals("JSESSIONID")){

					cookieSessionID =cookie[i].getValue();

				}

			}

			if(countCookie == null){

				Cookie firstCookie = new Cookie("pageCount", "1");
				firstCookie.setMaxAge(30);
				pageCount = Integer.parseInt(firstCookie.getValue());
				res.addCookie(firstCookie);

			}


		}else{

			Cookie firstCookie = new Cookie("pageCount", "1");
			firstCookie.setMaxAge(30);
			pageCount = Integer.parseInt(firstCookie.getValue());
			res.addCookie(firstCookie);

		}

		/*** 4 ***/
		res.setContentType("text/html; charset=UTF-8");

		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("SampleSessionCookie");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>");
		out.println("このページの表示回数は ");
		out.println("<font color=\"red\">");
		out.println(pageCount);
		out.println("</font>");
		out.println(" 回です!");
		out.println("</h2><br><br>");

		/*** 5 ***/
		if(cookieSessionID.equals(session.getId())){
			out.println("<h2>クッキーとセッションのセッションIDは同一です</h2>");
		}

		out.println("</body>");
		out.println("</html>");

	}

}
