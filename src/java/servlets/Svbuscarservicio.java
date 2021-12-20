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
import logica.Servicio;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svbuscarservicio", urlPatterns = {"/Svbuscarservicio"})
public class Svbuscarservicio extends HttpServlet {
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
        Servicio servicio=clp.obtenerServicio(Integer.parseInt(request.getParameter("idservicio")));
                       
        
        PrintWriter out = response.getWriter();
        
 
out.println(mostrarResultado(servicio));        
        
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

    private String mostrarResultado(Servicio servicio) {
String coincidencias=""; 

    
    coincidencias=coincidencias.concat("id servicio:"+servicio.getIdservicio()+"<br>");

  
    coincidencias=coincidencias.concat("nombre:"+servicio.getNombredeservicio()+"<br>");
    coincidencias=coincidencias.concat("costo:"+servicio.getCostodeservicio()+"<br>");
    coincidencias=coincidencias.concat("destino:"+servicio.getDestinodeservicio()+"<br>");
    coincidencias=coincidencias.concat("fecha:"+servicio.getFecha().getDate()+"/"
                                               +(servicio.getFecha().getMonth()+1)+"/"
                                               +(servicio.getFecha().getYear()+1900)
                                               +"<br>");
 coincidencias=coincidencias.concat("descripcion:"+servicio.getDescripcion()+"<br>");




//System.out.println(coincidencias);
return(coincidencias);
    








    }

}