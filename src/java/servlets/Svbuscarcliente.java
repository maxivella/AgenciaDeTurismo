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
import logica.Cliente;
import logica.ControladoraDeLogicaDePersistencia;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svbuscarcliente", urlPatterns = {"/Svbuscarcliente"})
public class Svbuscarcliente extends HttpServlet {
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
            throws ServletException, IOException { System.out.println("holaaaa"); 
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
        Cliente cliente=clp.obtenerCliente(Integer.parseInt(request.getParameter("idcliente")));
                       
        
        PrintWriter out = response.getWriter();
        
 
out.println(mostrarResultado(cliente));

        
        
    
 
        
        System.out.println(request.getParameter("idcliente"));
    
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

   private String mostrarResultado(Cliente cliente) {
String coincidencias=""; 
    
    coincidencias=coincidencias.concat("id cliente:"+cliente.getIdcliente()+"<br>");

  
    coincidencias=coincidencias.concat("nombre de cliente:"+cliente.getNombredecliente()+"<br>");
    coincidencias=coincidencias.concat("apellido:"+cliente.getApellidodecliente()+"<br>");
    coincidencias=coincidencias.concat("direccion:"+cliente.getDirecciondecliente()+"<br>");
    coincidencias=coincidencias.concat("dni:"+cliente.getDnidecliente()+"<br>");
    coincidencias=coincidencias.concat("f. de nac.:"+cliente.getFechadenacimientodecliente().getDate()+"/"
                                                    +(cliente.getFechadenacimientodecliente().getMonth()+1)+"/"
                                                    +(cliente.getFechadenacimientodecliente().getYear()+1900)
                                                    +"<br>");
    coincidencias=coincidencias.concat("nacionalidad:"+cliente.getNacionalidaddecliente()+"<br>");
    coincidencias=coincidencias.concat("celular:"+cliente.getCelulardecliente()+"<br>");
    coincidencias=coincidencias.concat("email:"+cliente.getEmail()+"<br>");        





//System.out.println(coincidencias);
return coincidencias;



    }    
    
    
    
    
}
