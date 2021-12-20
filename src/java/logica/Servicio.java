/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
public class Servicio implements Serializable {

 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
int idservicio; 
@Basic
String nombredeservicio;
String destinodeservicio;
float costodeservicio;
String descripcion;
@Temporal(TemporalType.DATE)
Date fecha;
/*@ManyToMany(targetEntity=Paquete.class)  
List<Paquete> paquetesIncluyendoServicio;*/

/*@ManyToMany(targetEntity=Venta.class)  
List<Venta> ventasDeServiciosAdicionales;*/


public Servicio(){}
public Servicio(int idServicio, String nombredeservicio, String destinodeservicio, float costodeservicio, String descripcion,Date fecha){
this( nombredeservicio,  destinodeservicio,  costodeservicio,  descripcion, fecha);
this.idservicio=idServicio;
}
    public Servicio( String nombredeservicio, String destinodeservicio, float costodeservicio, String descripcion,Date fecha) {
        //this.idservicio = idservicio;
        this.nombredeservicio = nombredeservicio;
        this.destinodeservicio = destinodeservicio;
        this.costodeservicio = costodeservicio;
        this.descripcion=descripcion;
        this.fecha=fecha;
        //this.paquetesIncluyendoServicio = paquetesIncluyendoServicio;
        //this.ventasDeServiciosAdicionales = ventasDeServiciosAdicionales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdservicio() {
        return idservicio;
    }
    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }
    public String getNombredeservicio() {
        return nombredeservicio;
    }
    public void setNombredeservicio(String nombredeservicio) {
        this.nombredeservicio = nombredeservicio;
    }
    public String getDestinodeservicio() {
        return destinodeservicio;
    }
    public void setDestinodeservicio(String destinodeservicio) {
        this.destinodeservicio = destinodeservicio;
    }
    public float getCostodeservicio() {
        return costodeservicio;
    }
    public void setCostodeservicio(float costodeservicio) {
        this.costodeservicio = costodeservicio;
    }
    
    
    
}
