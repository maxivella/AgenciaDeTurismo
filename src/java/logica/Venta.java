/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
public class Venta implements Serializable {

 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
int idventa;

@Temporal(TemporalType.DATE)
Date fecha;

@Basic
String mediodepago;

@ElementCollection
List<String> csa;


@ManyToOne//(cascade = CascadeType.MERGE)
Cliente cliente;

@ManyToOne
Empleado empleado;

@ManyToOne
Paquete paquete;

@ManyToMany
@JoinTable(name="VENTA_SERVICIO")
List<Servicio> serviciosAdicionales;


public Venta(){
    
}



    Venta( Empleado empleado, Date fecha, String mediodepago, Paquete paquete, ArrayList<Servicio> serviciosAdicionales, ArrayList<String> csa, Cliente cliente) {
        //this.idventa = idventa;
        this.fecha = fecha;
        this.mediodepago = mediodepago;
        this.serviciosAdicionales = serviciosAdicionales;
        this.csa = csa;
        this.cliente = cliente;
        this.empleado = empleado;
        this.paquete = paquete;

    }

    Venta(int idVenta, Empleado empleado, Date fecha, String mediodepago, Paquete paquete, ArrayList<Servicio> serviciosAdicionales, ArrayList<String> csa, Cliente cliente) {

this(empleado,fecha,mediodepago,paquete,serviciosAdicionales,csa,cliente);
this.idventa=idVenta;
    }

    public List<String> getCsa() {
        return csa;
    }

    public void setCsa(List<String> csa) {
        this.csa = csa;
    }
 
    public int getIdventa() {
        return idventa;
    }
    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMediodepago() {
        return mediodepago;
    }
    public void setMediodepago(String mediodepago) {
        this.mediodepago = mediodepago;
    }
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public List<Servicio> getServiciosAdicionales() {
        return serviciosAdicionales;
    }
    public void setServiciosAdicionales(List<Servicio> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    
}
