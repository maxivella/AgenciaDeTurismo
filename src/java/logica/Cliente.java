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
public class Cliente implements Serializable {
 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)  
int    idcliente;
@Basic 
String nombredecliente;
String apellidodecliente;
String direcciondecliente;
@Column(unique=true)
String dnidecliente;
String nacionalidaddecliente;
String celulardecliente; 
String email;

    Cliente(int idcliente, String nombrecliente, String apellido, String direccion, String dni, String nacionalidad, String celular, Date fechadenacimiento, String email) {
this(nombrecliente,apellido,direccion,dni,nacionalidad,celular,fechadenacimiento,email);
this.idcliente=idcliente;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


@Temporal(TemporalType.DATE)
Date   fechadenacimientodecliente;


/*@OneToMany(targetEntity=Venta.class)  
List<Venta> comprasRealizadas;*/
    
 public Cliente(){}

    public Cliente( String nombredecliente, String apellidodecliente, String direcciondecliente, String dnidecliente, String nacionalidaddecliente, String celulardecliente, Date fechadenacimientodecliente, String email) {
        //this.idcliente = idcliente;
        this.nombredecliente = nombredecliente;
        this.apellidodecliente = apellidodecliente;
        this.direcciondecliente = direcciondecliente;
        this.dnidecliente = dnidecliente;
        this.nacionalidaddecliente = nacionalidaddecliente;
        this.celulardecliente = celulardecliente;
        this.fechadenacimientodecliente = fechadenacimientodecliente;
        this.email = email;
    }
 
    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombredecliente() {
        return nombredecliente;
    }
    public void setNombredecliente(String nombredecliente) {
        this.nombredecliente = nombredecliente;
    }
    public String getApellidodecliente() {
        return apellidodecliente;
    }
    public void setApellidodecliente(String apellidodecliente) {
        this.apellidodecliente = apellidodecliente;
    }
    public String getDirecciondecliente() {
        return direcciondecliente;
    }
    public void setDirecciondecliente(String direcciondecliente) {
        this.direcciondecliente = direcciondecliente;
    }
    public String getDnidecliente() {
        return dnidecliente;
    }
    public void setDnidecliente(String dnidecliente) {
        this.dnidecliente = dnidecliente;
    }
    public Date getFechadenacimientodecliente() {
        return fechadenacimientodecliente;
    }
    public void setFechadenacimientodecliente(Date echadenacimientodecliente) {
        this.fechadenacimientodecliente = echadenacimientodecliente;
    }
    public String getNacionalidaddecliente() {
        return nacionalidaddecliente;
    }
    public void setNacionalidaddecliente(String nacionalidaddecliente) {
        this.nacionalidaddecliente = nacionalidaddecliente;
    }
    public String getCelulardecliente() {
        return celulardecliente;
    }
    public void setCelulardecliente(String celulardecliente) {
        this.celulardecliente = celulardecliente;
    }
 
 



}
