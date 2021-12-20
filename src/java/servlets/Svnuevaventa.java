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

/**
 *
 * @author USER
 */
@WebServlet(name = "Svnuevaventa", urlPatterns = {"/Svnuevaventa"})
public class Svnuevaventa extends HttpServlet {
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
        
   System.out.println("servlet");
 ArrayList<String[/*2*/]> serviciosAdicionales = new  ArrayList<String[/*2*/]>();      
       
 String[] idServAdic=request.getParameter("idserviciosadicionales").split(",");
 
 for(String s:idServAdic){System.out.println("idServAdic:"+s);}   ///  
 
ArrayList<Integer> venta_servicio= obtenerServiciosDelParametro( idServAdic,request.getParameter("idserviciosadicionales"));
 
 for(int i:venta_servicio){System.out.println("venta_servicio:"+i);}   ///
 
for(int i=0; i<venta_servicio.size(); i++){
String[] s=new String[2];

s[0]=String.valueOf(venta_servicio.get(i));
s[1]=contarCantidad(venta_servicio.get(i),idServAdic)+"/"+venta_servicio.get(i);

serviciosAdicionales.add(s);
    
}
//....

Integer idPaquete=Integer.parseInt(request.getParameter("idpaquete"));

String mediodepago=request.getParameter("mediodepago");
String apellido=request.getParameter("apellidodecliente");
String celular=request.getParameter("celulardecliente");
String codempleado=request.getParameter("codempleado");
String direccion=request.getParameter("direcciondecliente");
String dni=request.getParameter("dnidecliente");
String email=request.getParameter("emaildecliente");
String fecha=request.getParameter("fecha");
String fnacimiento=request.getParameter("fechadenacimientodecliente");
String nacionalidad=request.getParameter("nacionalidaddecliente");
String nombrecliente=request.getParameter("nombredecliente");

/*if(codempleado!=null && idPaquete!=null && dni!=null)*/ clp.crearVenta(idPaquete, serviciosAdicionales, mediodepago, apellido, celular, codempleado, direccion, dni, email, fecha, fnacimiento, nacionalidad, nombrecliente);

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

    private ArrayList<Integer> obtenerServiciosDelParametro(String[] idServAdic, String parameter) {
ArrayList<Integer> serviciosDelParametro = new ArrayList<Integer>();

if(parameter.isEmpty()) return serviciosDelParametro;

parameter="["+parameter+"]"+"*"; parameter=parameter.replace(",", "][");

for(int i=0; i<idServAdic.length; i++){   

if(!parameter.equals(parameter.replace("["+idServAdic[i]+"]",""))){serviciosDelParametro.add(Integer.parseInt(idServAdic[i]));  }

parameter=parameter.replace("["+idServAdic[i]+"]","");
    
    
}
return serviciosDelParametro;
    }

    private int contarCantidad(int venta_servicio, String[] idServAdic) {
//parameter="["+parameter+"]"; parameter=parameter.replace(",", "][");
int c=0;


for(int i=0; i<idServAdic.length; i++){

if(Integer.parseInt(idServAdic[i])==venta_servicio){c++;}

}

  return c;  

}
}