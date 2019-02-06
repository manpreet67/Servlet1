/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chanpreet
 */
public class Profile extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    
    request.getRequestDispatcher("index.html").include(request, response);
    Cookie ck[]=request.getCookies();
    if(ck!=null)
    { String name=ck[0].getValue();
        if(!name.equals("")||name!=null )
        {
            out.print("Welcome "+name);
        }
    }
    else
    {
    out.println("Please Login first!!!!");
    request.getRequestDispatcher("Login.html").include(request, response);
    }
    
   }
    
}
