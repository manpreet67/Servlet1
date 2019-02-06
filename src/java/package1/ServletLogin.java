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
public class ServletLogin extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                
                
         
                String uname=request.getParameter("uname");
                String pass=request.getParameter("pass");
                
                if(uname.equalsIgnoreCase("chan") && pass.equals("chanpreet"))
                {
                request.getRequestDispatcher("index.html").include(request, response);
                out.println("Login Successful!<br>");
                out.println("Welcome Mr."+uname);
                Cookie ck=new Cookie("uname",uname);
                response.addCookie(ck);
                }
                
                else
                {
                out.println("Sorry Wrong Details!<br>");
                request.getRequestDispatcher("Login.html").include(request, response);
                
                }
                    
                    
   }


}
