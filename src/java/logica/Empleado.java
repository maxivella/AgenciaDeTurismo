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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
public class Empleado implements Serializable {
 
 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
int idempleado;
@Basic
String nombredeempleado;
String direcciondeempleado;
@Column(unique=true)
String dnideempleado;
String nacionalidaddeempleado;
String celulardeempleado;
String emaildeempleado;
String cargodeempleado;
String apellidoempleado;
float sueldodeempleado;
@Column(unique=true)
String codigodeempleado; 

@Temporal(TemporalType.DATE)
Date fechadenacimientodeempleado;

   

/*@OneToMany(targetEntity=Venta.class)  
List<Venta> ventasRealizadas;*/
    
public Empleado(){}
public Empleado(int idEmpleado,String nombredeempleado, String direcciondeempleado, String dnideempleado, String nacionalidaddeempleado, String celulardeempleado, String emaildeempleado, String cargodeempleado, float sueldodeempleado, String codigodeempleado, String fechadenacimientodeempleado, String apellidoempleado){
this( nombredeempleado,  direcciondeempleado,  dnideempleado,  nacionalidaddeempleado,  celulardeempleado,  emaildeempleado,  cargodeempleado,  sueldodeempleado,  codigodeempleado,  fechadenacimientodeempleado,  apellidoempleado);
this.idempleado=idEmpleado;

}

    public Empleado( String nombredeempleado, String direcciondeempleado, String dnideempleado, String nacionalidaddeempleado, String celulardeempleado, String emaildeempleado, String cargodeempleado, float sueldodeempleado, String codigodeempleado, String fechadenacimientodeempleado, String apellidoempleado) {
        //this.idempleado = idempleado;
        this.nombredeempleado = nombredeempleado;
        this.direcciondeempleado = direcciondeempleado;
        this.dnideempleado = dnideempleado;
        this.nacionalidaddeempleado = nacionalidaddeempleado;
        this.celulardeempleado = celulardeempleado;
        this.emaildeempleado = emaildeempleado;
        this.cargodeempleado = cargodeempleado;
        this.sueldodeempleado = sueldodeempleado;
        this.codigodeempleado = codigodeempleado;
        this.apellidoempleado=apellidoempleado;
        this.fechadenacimientodeempleado = new Date(Integer.parseInt(fechadenacimientodeempleado.split("/")[2])-1900,Integer.parseInt(fechadenacimientodeempleado.split("/")[1])-1,Integer.parseInt(fechadenacimientodeempleado.split("/")[0]));
        
//this.ventasRealizadas = ventasRealizadas;
    }

    public String getApellidoempleado() {
        return apellidoempleado;
    }

    public void setApellidoempleado(String apellidoempleado) {
        this.apellidoempleado = apellidoempleado;
    }

    public int getIdempleado() {
        return idempleado;
    }
    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    public String getNombredeempleado() {
        return nombredeempleado;
    }
    public void setNombredeempleado(String nombredeempleado) {
        this.nombredeempleado = nombredeempleado;
    }
    public String getDirecciondeempleado() {
        return direcciondeempleado;
    }
    public void setDirecciondeempleado(String direcciondeempleado) {
        this.direcciondeempleado = direcciondeempleado;
    }
    public String getDnideempleado() {
        return dnideempleado;
    }
    public void setDnideempleado(String dnideempleado) {
        this.dnideempleado = dnideempleado;
    }
    public Date getFechadenacimientodeempleado() {
        return fechadenacimientodeempleado;
    }
    public void setFechadenacimientodeempleado(Date fechadenacimientodeempleado) {
        this.fechadenacimientodeempleado = fechadenacimientodeempleado;
    }
    public String getNacionalidaddeempleado() {
        return nacionalidaddeempleado;
    }
    public void setNacionalidaddeempleado(String nacionalidaddeempleado) {
        this.nacionalidaddeempleado = nacionalidaddeempleado;
    }
    public String getCelulardeempleado() {
        return celulardeempleado;
    }
    public void setCelulardeempleado(String celulardeempleado) {
        this.celulardeempleado = celulardeempleado;
    }
    public String getEmaildeempleado() {
        return emaildeempleado;
    }
    public void setEmaildeempleado(String emaildeempleado) {
        this.emaildeempleado = emaildeempleado;
    }
    public String getCargodeempleado() {
        return cargodeempleado;
    }
    public void setCargodeempleado(String cargodeempleado) {
        this.cargodeempleado = cargodeempleado;
    }
    public float getSueldodeempleado() {
        return sueldodeempleado;
    }
    public void setSueldodeempleado(float sueldodeempleado) {
        this.sueldodeempleado = sueldodeempleado;
    }
    public String getCodigodeempleado() {
        return codigodeempleado;
    }
    public void setCodigodeempleado(String codigodeempleado) {
        this.codigodeempleado = codigodeempleado;
    }


    
}
