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
import logica.Paquete;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svbuscarpaquete", urlPatterns = {"/Svbuscarpaquete"})
public class Svbuscarpaquete extends HttpServlet {
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
   
        Paquete paquete=clp.obtenerPaquete(Integer.parseInt(request.getParameter("idpaquete")));
                       
        
        PrintWriter out = response.getWriter();
        
 
out.println(mostrarResultado(paquete));       
        
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

    private String mostrarResultado(Paquete paquete) {

String coincidencias=""; 

    
    coincidencias=coincidencias.concat("id paquete:"+paquete.getIdpaquete()+"<br>");
    coincidencias=coincidencias.concat("nombre único:"+paquete.getNombreunicodepaquete()+"<br>");
    coincidencias=coincidencias.concat("costo:"+paquete.getCostodepaquete()+"<br>");        

    
  if(!paquete.getServiciosdepaquete().isEmpty()){  
    coincidencias=coincidencias.concat("servicios:"+"<br>");
    
   for(int s=0; s<paquete.getServiciosdepaquete().size();s++){ 
       coincidencias=coincidencias.concat("->"+paquete.getServiciosdepaquete().get(s).getNombredeservicio()+"("+paquete.getServiciosdepaquete().get(s).getIdservicio()+")<br>");
       
   }
  }else  coincidencias=coincidencias.concat("servicios:"+"ninguno"+"<br>");
  


//System.out.println(coincidencias);
return (coincidencias);






    }

}
