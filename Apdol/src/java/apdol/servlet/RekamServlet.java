/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hari RZ
 */
//@WebServlet(name = "RekamUser", urlPatterns = {"/RekamUser"})
public class RekamServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rdp = request.getRequestDispatcher("/pages/rekamUser.jsp");
        rdp.forward(request, response);
        
        //String username = request.getParameter("username");
        //String password = request.getParameter("password");
        //String nama = request.getParameter("nama");
        //String jabatan = request.getParameter("jabatan");
        //String roleuser = request.getParameter("roleuser");
        //String kodesatker = request.getParameter("kodesatker");
        
        //DaftarUser usr = new DaftarUser();
        //User user = new User();
        
      //  if(username.equals("") && password.equals("") && nama.equals("") && jabatan.equals("") && roleuser.equals("")/*&& kodesatker.equals("")*/){
        //    request.setAttribute("error", "errortes");
          //  request.getRequestDispatcher("/rekamUser.jsp");
            
        //} else {
           // user.setUsername(username);
            //user.setPassword(password);
            //user.setNama(nama);
            //user.setJabatan(jabatan);
            //user.setRoleuser(roleuser);
            //user.setKodeSatker(kodesatker);
            //usr.rekamUser(user);
        
        //}
        
          // String jsp = "pages/rekamUser.jsp";
           //RequestDispatcher rdp = request.getRequestDispatcher("/pages/rekamUser.jsp");
           //rdp.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}