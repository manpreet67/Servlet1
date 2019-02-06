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
public class Servlet8 extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //cookies
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String n=request.getParameter("uname");
        String password=request.getParameter("pass");
        Cookie ck=new Cookie("uname1", n);
        Cookie ck1=new Cookie("pass1", password);
        response.addCookie(ck);
        response.addCookie(ck1);
        out.println("Cookie passed Mr."+n+"<br>");
        out.print("<a href='Servlet9'>Visit next page</a>");
        
    }

 
}
