package sysblo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener /*** 1 ***/
public class SampleSessionListener implements HttpSessionListener {

	/*** 2 ***/
	public void sessionCreated(HttpSessionEvent event) {

		HttpSession session = event.getSession();

		System.out.println("セッションID : " + session.getId());
		System.out.println("セッションが作成されました");

	}

	/*** 3 ***/
	public void sessionDestroyed(HttpSessionEvent event) {

		System.out.println("セッションが破棄されました");

	}

}
