/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.edu.dmodi.loginwebapp.servlets;

import in.edu.dmodi.loginwebapp.util.Credential;
import in.edu.dmodi.loginwebapp.util.CredentialStore;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thiago
 */
public class ListerServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        
        try {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
        
            Set<Credential> users = CredentialStore.getUsers();
            out.print("<table border=1 cellSpacing=0 cellPadding=4>");
            out.print("<tr><th>Nome</th><th>e-mail</th>");
            users.forEach(u -> out.print("<tr><td>" + u.getFirstName()+ "</td><td>" + u.getEmail()+ "</td></tr>"));
            out.print("</table>");
            
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.include(request, response);
        } 
        catch (IOException ex) {
            Logger.getLogger(ListerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ServletException ex) {
            Logger.getLogger(ListerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
