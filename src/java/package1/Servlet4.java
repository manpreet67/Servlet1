/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.weld.bean.builtin.ee.ServletContextBean;

/**
 *
 * @author Chanpreet
 */
public class Servlet4 extends HttpServlet {

   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
        ServletContext context=request.getServletContext();
        String n=context.getInitParameter("LOL");
        out.print("Context param used!:"+n);
        
    
    
    }

   
}
