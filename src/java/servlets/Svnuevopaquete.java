/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "Svnuevopaquete", urlPatterns = {"/Svnuevopaquete"})
public class Svnuevopaquete extends HttpServlet {
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
       // Float costo= Float.parseFloat(request.getParameter("costodepaquete"));
        String nombreUnico=request.getParameter("nombreunicodepaquete");
        
        List<Servicio> serviciosDelPaquete= pasarAlista(request.getParameter("idserviciosdepaquete"));
    
    Float costo=calcularCosto(serviciosDelPaquete);   
        
 if(serviciosDelPaquete.size()>=2)       
{    clp.crearPaquete(costo, nombreUnico, serviciosDelPaquete);
PrintWriter out = response.getWriter();
out.println("ENVIADO AL SERVIDOR"); 
}
else
 {
 response.getWriter().println("PAQUETES DEBEN CONTENER AL MENOS DOS SERVICIOS");     
 }

 
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

    private List<Servicio> pasarAlista(String parameter) {
       List<Integer> servicios=obtenerServiciosDelParametro(parameter.split(","),parameter);
     ArrayList<Servicio> serviciosDelPaquete = new ArrayList<Servicio>();

for(int i=0; i<servicios.size(); i++){

serviciosDelPaquete.add(clp.obtenerServicio(servicios.get(i)));

}

return serviciosDelPaquete;
    }

     private ArrayList<Integer> obtenerServiciosDelParametro(String[] idServAdic, String parameter) {
ArrayList<Integer> serviciosDelParametro = new ArrayList<Integer>();
        
parameter="["+parameter+"]"+"*"; parameter=parameter.replace(",", "][");

for(int i=0; i<idServAdic.length; i++){   

if(!parameter.equals(parameter.replace("["+idServAdic[i]+"]",""))){serviciosDelParametro.add(Integer.parseInt(idServAdic[i]));  }

parameter=parameter.replace("["+idServAdic[i]+"]","");
    
    
}
return serviciosDelParametro;
    }   

    private Float calcularCosto(List<Servicio> serviciosDelPaquete) {
float costo=0;
for(int i=0; i<serviciosDelPaquete.size(); i++){

costo=costo+serviciosDelPaquete.get(i).getCostodeservicio();
}

return serviciosDelPaquete.size()<2?costo:(costo-((10*costo)/100));

    }
    
    
    
}
