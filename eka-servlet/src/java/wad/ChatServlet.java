/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad;

import javax.servlet.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class ChatServlet extends HttpServlet implements ChatConstants {

	/** Called in response to a GET request (data encoded in the URL) */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
            
		ServletContext application = getServletContext();

		ChatState chat = (ChatState)application.getAttribute(APP_STATE);
		// assert(chat != null);

                
		String iSay = request.getParameter("iSay");
		if (iSay != null) {
			iSay = iSay.trim();
			if (iSay.length() != 0) {
				synchronized(chat) {
					chat.chat.add(iSay);
					chat.last++;
				}
			}
		}

		// Output section in MVC: dispatch to JSP to display the work.
		// (Remember the URL for an RD **MUST** be absolute).
		RequestDispatcher rd = application.getRequestDispatcher("/chat.jsp");
		rd.forward(request, response);
		/*NOTREACHED*/
	}

}
