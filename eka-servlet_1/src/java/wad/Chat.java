/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

/**
 *
 * @author vkesola
 */
public class Chat extends HttpServlet {
    
    private static Queue<String> viestit;
    public Chat() { this.viestit = new LinkedList(); }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
                out.println("testing");
        } finally {
            out.close();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out = response.getWriter();
                       String viesti = request.getParameter("viesti");
                          viestit.add(viesti);
                       /*   Iterator it = viestit.iterator();
                            while(it.hasNext())
                            {
                                out.println(it.next());
                            }
        */
                    request.setAttribute("viestit", viestit);
        
                    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                    dispatcher.forward(request, response); 
                
    }    
}
