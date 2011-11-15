/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.servlet;

import apdol.entity.User;
import apdol.model.DaftarUser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Accio
 */
//@WebServlet(name = "HomeServlet", urlPatterns = {"/main"})
public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            String username = request.getParameter("username");
            String password = request.getParameter("password");

        DaftarUser usr = new DaftarUser();
        User user = new User();
        HttpSession session = request.getSession();
        boolean resultCheck = usr.check(username, password);
        user = usr.getUser(username, password);
                
        if(username.equals("") || password.equals("")){
            request.setAttribute("error", "Username/Password tidak boleh kosong!");
            request.getRequestDispatcher("/main.jsp").forward(request, response);
        } else {
            if(resultCheck){
                if(user.getRoleuser().equals("1")){
                session.setAttribute("username", username);
                session.setAttribute("roleuser", user.getRoleuser());
                response.sendRedirect("home");
                //request.getRequestDispatcher("home").forward(request, response);
                //Halaman redirect sesuai role dari masing2 user, tampilan menyusul.
                }else {
                    if(user.getRoleuser().equals("2")){
                    session.setAttribute("username", username);
                    session.setAttribute("roleuser", user.getRoleuser());
                    request.getRequestDispatcher("home").forward(request, response);
                    }else {
                        if(user.getRoleuser().equals("3")){
                            session.setAttribute("username", username);
                            session.setAttribute("roleuser", user.getRoleuser());
                            request.getRequestDispatcher("home").forward(request, response);
                        
                        }
                    }
                }
            } else {
                    request.setAttribute("error2", "Username/Password tidak terdaftar");
                    request.getRequestDispatcher("/main.jsp").forward(request, response);
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}