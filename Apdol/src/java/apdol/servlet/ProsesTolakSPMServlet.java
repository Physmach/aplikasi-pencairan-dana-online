/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.servlet;

import apdol.comparator.SpmComparator;
import apdol.entity.SPM;
import apdol.model.DaftarSPM;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class ProsesTolakSPMServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            DaftarSPM daftarSPM = new DaftarSPM();
            List<SPM> listSPM = daftarSPM.getSPM();
            Collections.sort(listSPM, new SpmComparator());
            String id = request.getParameter("spm_id");
            String nomorSurat = request.getParameter("nomor_surat");
            String keterangan = request.getParameter("keterangan");
            String nomorTolak = request.getParameter("nomor_tolak");
            
            String tanggal = request.getParameter("tanggal") + "/";
            String bulan = request.getParameter("bulan") + "/";
            String tahun = request.getParameter("tahun");
            String stringDate = tanggal + bulan + tahun;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date date = df.parse(stringDate);
            
            String jsp = "";

            int j = JOptionPane.showConfirmDialog(null, "apakah anda yakin akan menolak SPM ini ?",
                    JOptionPane.MESSAGE_TYPE_PROPERTY, JOptionPane.YES_NO_OPTION);

            if (j == JOptionPane.YES_OPTION) {
                long idSpm = Long.parseLong(id);
                SPM spm = daftarSPM.findSPM(idSpm);
                String statSPM = "Ditolak KPPN";
                spm.setNomorPembatalan(nomorSurat);
                spm.setNomorTolak(nomorTolak);
                spm.setKeteranganTolak(keterangan);
                spm.setNomorPembatalan(nomorSurat);
                spm.setTanggalTolak(date);
                spm.setStatusSpm(statSPM);
                daftarSPM.edit(spm);
            }            
            
            listSPM = daftarSPM.getSPM();
            Collections.sort(listSPM, new SpmComparator());
            request.setAttribute("list_spm", listSPM);
            jsp = "pages/tolak_spm.jsp";

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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ProsesTolakSPMServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ProsesTolakSPMServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
