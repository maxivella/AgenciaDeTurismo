/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraDeLogicaDePersistencia;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svnuevoempleado", urlPatterns = {"/Svnuevoempleado"})
public class Svnuevoempleado extends HttpServlet {
      ControladoraDeLogicaDePersistencia clp=new ControladoraDeLogicaDePersistencia();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
try{
        
        
String apellido=request.getParameter("apellidodeempleado");
String celular=request.getParameter("celulardeempleado");
String direccion=request.getParameter("direcciondeempleado");
String dni=request.getParameter("dnideempleado");
String email=request.getParameter("emaildeempleado");
String fnacimiento=request.getParameter("fechadenacimientodeempleado");
String nacionalidad=request.getParameter("nacionalidaddeempleado");
String nombre=request.getParameter("nombredeempleado");       

String sueldo=request.getParameter("sueldodeempleado");   
String cargo=request.getParameter("cargodeempleado");
String codempleado=request.getParameter("codigodeempleado");   
//       public void crearEmpleado(String apellido, String cargo, String celular, String codempleado, String direccion, String dni, String email, String fnacimiento, String nacionalidad, String nombreempleado, float sueldo) {
        
 clp.crearEmpleado(apellido, cargo, celular, codempleado, direccion, dni, email, fnacimiento, nacionalidad, nombre, Float.parseFloat(sueldo));

PrintWriter out = response.getWriter();
out.println("ENVIADO AL SERVIDOR"); 
   
}catch(Exception  e){response.getWriter().println("ERROR ENVIANDO DATOS. VERFIQUE LOS CAMPOS INGRESADOS");}     

}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
