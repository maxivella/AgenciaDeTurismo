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
import logica.Empleado;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svbuscarempleado", urlPatterns = {"/Svbuscarempleado"})
public class Svbuscarempleado extends HttpServlet {
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
        Empleado empleado=clp.obtenerEmpleado(Integer.parseInt(request.getParameter("idempleado")));
                       
        
        PrintWriter out = response.getWriter();
        
 
out.println(mostrarResultado(empleado));        
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

    private String mostrarResultado(Empleado empleado) {
String coincidencias=""; 

    
    coincidencias=coincidencias.concat("id empleado:"+empleado.getIdempleado()+"<br>");

  
    coincidencias=coincidencias.concat("nombre de empleado:"+empleado.getNombredeempleado()+"<br>");
    coincidencias=coincidencias.concat("apellido:"+empleado.getApellidoempleado()+"<br>");
    coincidencias=coincidencias.concat("direccion:"+empleado.getDirecciondeempleado()+"<br>");
    coincidencias=coincidencias.concat("dni:"+empleado.getDnideempleado()+"<br>");
    coincidencias=coincidencias.concat("f. de nac.:"+empleado.getFechadenacimientodeempleado().getDate()+"/"
                                                    +(empleado.getFechadenacimientodeempleado().getMonth()+1)+"/"
                                                    +(empleado.getFechadenacimientodeempleado().getYear()+1900)
                                                    +"<br>");
    coincidencias=coincidencias.concat("nacionalidad:"+empleado.getNacionalidaddeempleado()+"<br>");
    coincidencias=coincidencias.concat("celular:"+empleado.getCelulardeempleado()+"<br>");
    coincidencias=coincidencias.concat("email:"+empleado.getEmaildeempleado()+"<br>");        
    coincidencias=coincidencias.concat("cargo:"+empleado.getCargodeempleado()+"<br>");        
    coincidencias=coincidencias.concat("sueldo:"+empleado.getSueldodeempleado()+"<br>");        
    coincidencias=coincidencias.concat("codigo:"+empleado.getCodigodeempleado()+"<br>");        



//System.out.println(coincidencias);
return (coincidencias);







    }

}
