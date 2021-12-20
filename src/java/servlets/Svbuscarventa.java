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
import logica.Venta;

/**
 *
 * @author USER
 */
@WebServlet(name = "Svbuscarventa", urlPatterns = {"/Svbuscarventa"})
public class Svbuscarventa extends HttpServlet {
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
          Venta venta=clp.traerVenta(Integer.parseInt(request.getParameter("idventa")));
                       
        
        PrintWriter out = response.getWriter();
        
 
out.println(mostrarResultado(venta));      
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

    private String mostrarResultado(Venta venta) {
String resultado=""; 

    
    resultado=resultado.concat("id venta:"+venta.getIdventa()+"<br>");
    resultado=resultado.concat("empleado:"+venta.getEmpleado().getCodigodeempleado()+"<br>");
    resultado=resultado.concat("fecha:"+venta.getFecha().getDate()+"/"
                                               +(venta.getFecha().getMonth()+1)+"/"
                                               +(venta.getFecha().getYear()+1900)
                                               +"<br>");        
    resultado=resultado.concat("m. de pago:"+venta.getMediodepago()+"<br>");        
    resultado=resultado.concat("paquete:"+venta.getPaquete().getNombreunicodepaquete()+"("+venta.getPaquete().getIdpaquete()+")"+"<br>");
   
    
    
  if(!venta.getCsa().isEmpty()){  
    resultado=resultado.concat("serv. adicional:"+"<br>");
    
   for(int s=0; s<venta.getCsa().size();s++){ 
    Servicio serv= clp.obtenerServicio(Integer.parseInt(venta.getCsa().get(s).split("/")[1]));  ;
    int cantidad=Integer.parseInt(venta.getCsa().get(s).split("/")[0]);   
       
       resultado=resultado.concat("->"+serv.getNombredeservicio()+"("+serv.getIdservicio()+")"+" X"+cantidad+"<br>");
    
   }
  }else  resultado=resultado.concat("serv. adicional:"+"ninguno"+"<br>");
  
  
  
    resultado=resultado.concat("nombre de cliente:"+venta.getCliente().getNombredecliente()+"<br>");
    resultado=resultado.concat("apellido:"+venta.getCliente().getApellidodecliente()+"<br>");
    resultado=resultado.concat("direccion:"+venta.getCliente().getDirecciondecliente()+"<br>");
    resultado=resultado.concat("dni:"+venta.getCliente().getDnidecliente()+"<br>");
    resultado=resultado.concat("f. de nac.:"+venta.getCliente().getFechadenacimientodecliente().getDate()+"/"
                                                    +(venta.getCliente().getFechadenacimientodecliente().getMonth()+1)+"/"
                                                    +(venta.getCliente().getFechadenacimientodecliente().getYear()+1900)
                                                    +"<br>");
    resultado=resultado.concat("nacionalidad:"+venta.getCliente().getNacionalidaddecliente()+"<br>");
    resultado=resultado.concat("celular:"+venta.getCliente().getCelulardecliente()+"<br>");
    resultado=resultado.concat("email:"+venta.getCliente().getEmail()+"<br>");        





//System.out.println(coincidencias);
return (resultado);



    }

}
