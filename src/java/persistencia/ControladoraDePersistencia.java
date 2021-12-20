/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Empleado;
import logica.Paquete;
import logica.Servicio;
import logica.Venta;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author user
 */
public class ControladoraDePersistencia {
       
VentaJpaController ventaJpaController = new VentaJpaController();
PaqueteJpaController paqueteJpaController = new PaqueteJpaController();
ClienteJpaController clienteJpaController = new ClienteJpaController();
ServicioJpaController servicioJpaController = new ServicioJpaController();
EmpleadoJpaController empleadoJpaController = new EmpleadoJpaController();
    
    public void altaServicio(Servicio servicio)  {
        try {
            servicioJpaController.create(servicio); 
        } 
        //catch(persistencia.exceptions.PreexistingEntityException peex){JOptionPane.showMessageDialog(null, "esta intentando ingresar un numero de cliente repetido", "error", JOptionPane.INFORMATION_MESSAGE);}
        
        catch (Exception ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }

    public void destruirServicio(int idServicio) {

    try {
        servicioJpaController.destroy(idServicio);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    public List<Servicio> traerTodosLosServicios() {

        return servicioJpaController.findServicioEntities();
    }

    public void modificarServicio(Servicio servicio) {
    try {
        servicioJpaController.edit(servicio);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }

    public Servicio buscarServicio(int idservicio) {

        return servicioJpaController.findServicio(idservicio);
    }

    public List<Paquete> traerTodosLosPaquetes() {

return paqueteJpaController.findPaqueteEntities();
    }

    public void altaPaquete(Paquete paquete) {
    try {
            paqueteJpaController.create(paquete); 
        } 
        //catch(persistencia.exceptions.PreexistingEntityException peex){JOptionPane.showMessageDialog(null, "esta intentando ingresar un numero de cliente repetido", "error", JOptionPane.INFORMATION_MESSAGE);}
        
        catch (Exception ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        
        }

    }

    public void altaVenta(Venta venta) {

 ventaJpaController.create(venta);

    }



    public List<Cliente> obtenerTodosLosClientes() {
return clienteJpaController.findClienteEntities();

    }

    public List<Empleado> obtenerTodosLosEmpleados() {

return empleadoJpaController.findEmpleadoEntities();

    }

    public void altaCliente(Cliente cliente) {

clienteJpaController.create(cliente);

    }

    public Paquete buscarPaquete(int idpaquete) {

return paqueteJpaController.findPaquete(idpaquete);

    }

    public void altaEmpleado(Empleado empleado) {

empleadoJpaController.create(empleado);

    }

    public List<Venta> traerTodasLasVentas() {

return ventaJpaController.findVentaEntities();
    }

    public void bajaVenta(Integer idVentaEliminar) {

    try {ventaJpaController.destroy(idVentaEliminar);} 
    catch (NonexistentEntityException ex) {
    Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
                                          }
                                                    }

    public Venta buscarVenta(int idVenta) {

        return ventaJpaController.findVenta(idVenta);
        
    }

    public void editarVenta(Venta venta) {

    try {
        ventaJpaController.edit(venta);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    public void editarCliente(Cliente cliente) {

    try {
        clienteJpaController.edit(cliente);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public void bajaPaquete(int idPaqueteEliminar) {

    try {
        paqueteJpaController.destroy(idPaqueteEliminar);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    public void editarPaquete(Paquete paquete) {

    try {
        paqueteJpaController.edit(paquete);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public void editarEmpleado(Empleado empleado) {
    try {
        empleadoJpaController.edit(empleado);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    public void bajaCliente(int idClienteEliminar) {
    try {
        clienteJpaController.destroy(idClienteEliminar);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    public void bajaEmpleado(int idEmpleadoEliminar) {
    try {
        empleadoJpaController.destroy(idEmpleadoEliminar);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    public void bajaServicio(int idServicioEliminar) {

    try {
        servicioJpaController.destroy(idServicioEliminar);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Cliente buscarCliente(int idCliente) {

return clienteJpaController.findCliente(idCliente);
    }

    public Empleado buscarEmpleado(int idEmpleado) {
return empleadoJpaController.findEmpleado(idEmpleado);

    }


    
}
