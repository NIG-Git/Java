package sysblo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener /*** 1 ***/
public class SampleContextListener implements ServletContextListener {

	/*** 2 ***/
	public void contextInitialized(ServletContextEvent event) {

		ServletContext context = event.getServletContext();

		context.setAttribute("msg", context.getInitParameter("initParam"));

		System.out.println("アプリケーションサーバ起動");

	}

	/*** 3 ***/
	public void contextDestroyed(ServletContextEvent event) {

		System.out.println("アプリケーションサーバ停止");

	}

}
