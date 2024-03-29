/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.servlet;

import apdol.comparator.SatuanKerjaComparator;
import apdol.entity.Lokasi;
import apdol.entity.SatuanKerja;
import apdol.model.DaftarLokasi;
import apdol.model.DaftarSatuanKerja;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Accio
 */
public class EditSatkerServlet extends HttpServlet {

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
        try {
            DaftarLokasi daftarLokasi = new DaftarLokasi();
            List<Lokasi> listLokasi = daftarLokasi.getLokasi();
            request.setAttribute("list_lokasi", listLokasi);
            
            
            DaftarSatuanKerja daftarSatker = new DaftarSatuanKerja();
            SatuanKerja lokasiSatker = new SatuanKerja();
            List<SatuanKerja> listSatker = daftarSatker.getSatuanKerja();
            Collections.sort(listSatker, new SatuanKerjaComparator());
            request.setAttribute("list_satker", listSatker);
            String jsp = "";
            String cekSatker = request.getParameter("edit_satker");

                Long idSatker = Long.parseLong(cekSatker);
                SatuanKerja satker = daftarSatker.findSatuanKerja(idSatker);
                request.setAttribute("satker_edit", satker);
                request.setAttribute("lokasiSatker", lokasiSatker.getLokasi());
                jsp = "/pages/edit_satker.jsp";

            RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
            requestDispatcher.forward(request, response);
        } finally {            
            out.close();
        }
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
