/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author vkesola
 */
public class ChatListener 
	implements ChatConstants, HttpSessionListener, ServletContextListener {


	/** Called when a new user comes along. Create a null
	 * UserState object and store it in the session.
	 */
	public void sessionCreated(HttpSessionEvent e) {
		HttpSession sess = e.getSession();
		sess.setAttribute(USER_STATE, new UserState());
		// XXX Get the ServletContext and add the user to it.
		System.out.println("Chat User Set Up");
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		// Log this, but the Session is already destroyed.
		System.out.println("Chat User Removed");
	}

	/**
	 * The Chat Application is starting up. Create all of its global data!
 	 */
	public void contextInitialized(ServletContextEvent e) {
		ServletContext ctx = e.getServletContext();
		ctx.setAttribute(APP_STATE, new ChatState());
		System.out.println("Chat Application Initialized");
	}

	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Chat Application Destroyed");
	}
}
