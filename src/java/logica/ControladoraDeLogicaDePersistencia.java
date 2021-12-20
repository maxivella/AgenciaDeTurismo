/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ControladoraDePersistencia;

/**
 *
 * @author user
 */
public class ControladoraDeLogicaDePersistencia {
    
 ControladoraDePersistencia controlPersis = new ControladoraDePersistencia();  

    public List<Paquete> obtenerListaDePaquetes() {

return controlPersis.traerTodosLosPaquetes();

    }

    public List<Servicio> obtenerListaDeServicios() {

return controlPersis.traerTodosLosServicios();

    }

public void crearServicio(Servicio servicio) {

controlPersis.altaServicio(servicio);

    }

    void crearPaquete(Paquete paquete) {


controlPersis.altaPaquete(paquete);

    }

public void crearVenta(int idpaquete,
                       List<String[/*2*/]> listaIdServiciosAdicionales,
                       String mediodepago,
                       String apellido,
                       String celular,
                       String codempleado,
                       String direccion,
                       String dni,
                       String email,
                       String fecha,
                       String fnacimiento,
                       String nacionalidad,
                       String nombrecliente) {

//chequear que el empleado exista

String dniEmpleado="";
String codEmpleado=codempleado;
Empleado empleado=obtenerEmpleadoPorCodigo(codEmpleado); System.out.println(empleado.dnideempleado);

Paquete paquete=obtenerPaquete(idpaquete);
Cliente cliente= new Cliente(nombrecliente, apellido, direccion, dni, nacionalidad,  celular, new Date(obtenerAnyo(fnacimiento),obtenerMes(fnacimiento),obtenerDia(fnacimiento)), email);

ArrayList<Servicio> serviciosAdicionales= obtenerParteDeServicios(listaIdServiciosAdicionales);
ArrayList<String> csa = obtenerParteDeCsa(listaIdServiciosAdicionales);

  if(empleado!=null && empleadoExiste(empleado.getCodigodeempleado(),empleado.getDnideempleado())==3){ 
      
    //chequear si ya existe el cliente en CLIENTE, por el dni
  if(!clienteExiste(cliente.getDnidecliente())){ crearCliente(cliente );  }else{cliente=obtenerClientePorDni(dni); }
 
  
  
  
  
  
  
      
          
Venta venta=new Venta(empleado,
                      new Date(obtenerAnyo(fecha),obtenerMes(fecha),obtenerDia(fecha)), 
                      mediodepago,
                      paquete,
                      serviciosAdicionales,
                      csa,
                      cliente);       
          
          
          
          controlPersis.altaVenta(venta);

}else System.out.println("no existe empleado");
 

    }
   
 private  boolean clienteExiste(String dnidecliente) {

List<Cliente> clientes = controlPersis.obtenerTodosLosClientes();

for(int i=0; i<clientes.size(); i++){ if (clientes.get(i).getDnidecliente().equals(dnidecliente)) return true;  }
  
return false;

    }   

private  int empleadoExiste(String codigodeempleado, String dnideempleado) {
int dniFlag=0;
int codFlag=0;
        
        
List<Empleado> empleados = controlPersis.obtenerTodosLosEmpleados();

for(int i=0; i<empleados.size(); i++){ if (empleados.get(i).getCodigodeempleado().equals(codigodeempleado)) codFlag=1;  }
  
for(int i=0; i<empleados.size(); i++){ if (empleados.get(i).getDnideempleado().equals(dnideempleado)) dniFlag=1;  }

if(dniFlag==0 && codFlag==0) return 0;
if(dniFlag==0 && codFlag==1) return 1;
if(dniFlag==1 && codFlag==0) return 2;
if(dniFlag==1 && codFlag==1) return 3;

return -1;
    }

    private Empleado obtenerEmpleadoPorCodigo(String codEmpleado) {
List<Empleado> empleados= controlPersis.obtenerTodosLosEmpleados();

for(int i=0; i<empleados.size(); i++) {
  System.out.println(empleados.get(i).getCodigodeempleado()+"=="+codEmpleado);
if(empleados.get(i).getCodigodeempleado().equals(codEmpleado)) return empleados.get(i);

}
return null;

    }

    public void crearCliente(Cliente cliente){

controlPersis.altaCliente(cliente);

    }

    public Paquete obtenerPaquete(int idpaquete) {

return controlPersis.buscarPaquete(idpaquete);

    }

    private ArrayList<Servicio> obtenerParteDeServicios(List<String[]> listaIdServiciosAdicionales) {
ArrayList<Servicio> serviciosAdicionales = new ArrayList<Servicio>();

for(int i=0; i<listaIdServiciosAdicionales.size(); i++) serviciosAdicionales.add(obtenerServicio(Integer.parseInt(listaIdServiciosAdicionales.get(i)[0])));

return serviciosAdicionales;
    }

    private ArrayList<String> obtenerParteDeCsa(List<String[]> listaIdServiciosAdicionales) {
ArrayList<String> csa = new ArrayList<String>();

for(int i=0; i<listaIdServiciosAdicionales.size(); i++) csa.add(listaIdServiciosAdicionales.get(i)[1]);

return csa;

    }

    private Cliente obtenerClientePorDni(String dni) {
List<Cliente> clientes = controlPersis.obtenerTodosLosClientes();

for(int i=0; i<clientes.size(); i++){ if (clientes.get(i).getDnidecliente().equals(dni)) return clientes.get(i);  }
  
return null;

    }

    public Servicio obtenerServicio(Integer idservicio) {
return controlPersis.buscarServicio(idservicio);

    }

    void crearEmpleado(Empleado empleado) {

controlPersis.altaEmpleado(empleado);
    }

    
private int obtenerAnyo(String fecha){
    
   return (Integer.parseInt(fecha.split("/")[2])-1900);
    
    
}      
    
private int obtenerMes(String fecha){
    
    return (Integer.parseInt(fecha.split("/")[1])-1);
}    

private int obtenerDia(String fecha){
    
    return Integer.parseInt(fecha.split("/")[0]);
}  

    public List<Venta> obtenerListaDeVentas() {

return controlPersis.traerTodasLasVentas();

    }

    public void eliminarVenta(Integer idVentaEliminar) {

controlPersis.bajaVenta(idVentaEliminar);

    }

    public Venta traerVenta(int idVenta) {

return controlPersis.buscarVenta(idVenta);
    }

    public void editarVenta(int idVenta, int idpaquete, List<String[]> listaIdServiciosAdicionales, String mediodepago, String apellido, String celular, String codempleado, String direccion, String dni, String email, String fecha, String fnacimiento, String nacionalidad, String nombrecliente) {
//chequear que el empleado exista

String dniEmpleado="";
String codEmpleado=codempleado;
Empleado empleado=obtenerEmpleadoPorCodigo(codEmpleado); System.out.println(empleado.dnideempleado);

Paquete paquete=obtenerPaquete(idpaquete);
Cliente cliente= new Cliente(nombrecliente, apellido, direccion, dni, nacionalidad,  celular, new Date(obtenerAnyo(fnacimiento),obtenerMes(fnacimiento),obtenerDia(fnacimiento)), email);

ArrayList<Servicio> serviciosAdicionales= obtenerParteDeServicios(listaIdServiciosAdicionales);
ArrayList<String> csa = obtenerParteDeCsa(listaIdServiciosAdicionales);

  if(empleado!=null && empleadoExiste(empleado.getCodigodeempleado(),empleado.getDnideempleado())==3){ 
      
    //chequear si ya existe el cliente en CLIENTE, por el dni
  if(!clienteExiste(cliente.getDnidecliente())){ crearCliente(cliente );  }else{System.out.println("cliente encontrado");cliente=obtenerClientePorDni(dni); cliente=new Cliente(cliente.getIdcliente(),nombrecliente,apellido,direccion,dni,nacionalidad,celular,new Date(obtenerAnyo(fnacimiento),obtenerMes(fnacimiento),obtenerDia(fnacimiento)),email); editarCliente(cliente);}
      
      
          
Venta venta=new Venta(idVenta,
                      empleado,
                      new Date(obtenerAnyo(fecha),obtenerMes(fecha),obtenerDia(fecha)), 
                      mediodepago,
                      paquete,
                      serviciosAdicionales,
                      csa,
                      cliente);       
          
          
          
          controlPersis.editarVenta(venta);
      
}else System.out.println("no existe empleado(no editado)");
 


    }

    private void editarCliente(Cliente cliente) {

controlPersis.editarCliente(cliente);

    }

    public void crearPaquete(float costoPaquete, String nombreUnico, List<Servicio> listaServiciosPaquete) {

controlPersis.altaPaquete(new Paquete(costoPaquete, nombreUnico, listaServiciosPaquete));

    }

    public void eliminarPaquete(int idPaqueteEliminar) {
controlPersis.bajaPaquete(idPaqueteEliminar);


    }

    public void editarPaquete(int idPaquete, float costoPaquete, String nombreUnico, List<Servicio> listaServiciosPaquete) {

controlPersis.editarPaquete(new Paquete( idPaquete,  costoPaquete,  nombreUnico, listaServiciosPaquete) );
    }

    public void crearEmpleado(String apellido, String cargo, String celular, String codempleado, String direccion, String dni, String email, String fnacimiento, String nacionalidad, String nombreempleado, float sueldo) {

controlPersis.altaEmpleado(new Empleado(nombreempleado,direccion,dni,nacionalidad,celular,email,cargo,sueldo,codempleado, fnacimiento,apellido));

    }

    public void crearCliente(String apellido, String celular, String direccion, String dni, String email, String fnacimiento, String nacionalidad, String nombrecliente) {

crearCliente(new Cliente(nombrecliente,apellido,direccion,dni,nacionalidad,celular,new Date(obtenerAnyo(fnacimiento),obtenerMes(fnacimiento),obtenerDia(fnacimiento)),email ));

    }

    public void crearServicio(String descripcion, float costo, String destino, String fecha, String nombredeservicio) {

crearServicio(new Servicio( nombredeservicio,  destino,  costo, descripcion, new Date(obtenerAnyo(fecha),obtenerMes(fecha),obtenerDia(fecha))));

    }

    public List<Cliente> obtenerListaDeClientes() {

return controlPersis.obtenerTodosLosClientes();

    }

    public void eliminarCliente(int idClienteEliminar) {

controlPersis.bajaCliente(idClienteEliminar);

    }

    public List<Empleado> obtenerListaDeEmpleados() {

 return controlPersis.obtenerTodosLosEmpleados();
        
    }

    public void eliminarEmpleado(int idEmpleadoEliminar) {
controlPersis.bajaEmpleado(idEmpleadoEliminar);

    }

    public void eliminarServicio(int idServicioEliminar) {
controlPersis.bajaServicio(idServicioEliminar);

    }

    public Cliente obtenerCliente(int idCliente) {

return controlPersis.buscarCliente(idCliente);
    }

    public Empleado obtenerEmpleado(int idEmpleado) {
return controlPersis.buscarEmpleado(idEmpleado);

    }

    public void editarCliente(int idCliente, String apellido, String celular, String direccion, String dni, String email, String fnacimiento, String nacionalidad, String nombrecliente) {
editarCliente(new Cliente(idCliente,nombrecliente,apellido,direccion,dni,nacionalidad,celular,new Date(obtenerAnyo(fnacimiento),obtenerMes(fnacimiento),obtenerDia(fnacimiento)),email));


    }

    public void editarEmpleado(int idEmpleado, String apellido, String celular, String direccion, String dni, String email, String fnacimiento, String nacionalidad, String nombreempleado, String sueldo, String codempleado, String cargo) {
controlPersis.editarEmpleado(new Empleado(idEmpleado,nombreempleado,direccion,dni,nacionalidad,celular,email,cargo,Float.parseFloat(sueldo),codempleado,fnacimiento,apellido));

    }

    public void editarServicio(int idServicio, String costo, String destino, String fecha, String nombredeservicio, String descripcion) {

controlPersis.modificarServicio(new Servicio(idServicio,nombredeservicio,destino,Float.parseFloat(costo),descripcion,new Date(obtenerAnyo(fecha),obtenerMes(fecha),obtenerDia(fecha))));

    }

}
