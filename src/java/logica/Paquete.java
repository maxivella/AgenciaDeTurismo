/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class Paquete implements Serializable {

 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
int    idpaquete;
@Basic
float  costodepaquete;
@Column(unique=true)
String nombreunicodepaquete;

@ManyToMany//(targetEntity=Servicio.class , cascade = CascadeType.PERSIST)
@JoinTable(name="PAQUETE_SERVICIO"/*, 
           joinColumns=@JoinColumn(name="_id"),
           inverseJoinColumns=@JoinColumn(name="author_id")*/)         
List<Servicio> serviciosdepaquete;

/*@OneToMany(targetEntity=Venta.class)  
List<Venta> ventasDelPaquete;*/

    public Paquete(){}

    public Paquete( float costodepaquete, String nombreunicodepaquete, List<Servicio> serviciosdepaquete/*, List<Venta> ventasDelPaquete*/) {
       // this.idpaquete = idpaquete;
        this.costodepaquete = costodepaquete;
        this.nombreunicodepaquete = nombreunicodepaquete;
        this.serviciosdepaquete = serviciosdepaquete;
      //this.ventasDelPaquete = ventasDelPaquete;
    }

    Paquete(int idPaquete, float costoPaquete, String nombreUnico, List<Servicio> listaServiciosPaquete) {
this( costoPaquete,  nombreUnico,  listaServiciosPaquete);
this.idpaquete=idPaquete;
    }
 
    public int getIdpaquete() {
        return idpaquete;
    }
    public void setIdpaquete(int idpaquete) {
        this.idpaquete = idpaquete;
    }
    public float getCostodepaquete() {
        return costodepaquete;
    }
    public void setCostodepaquete(float costodepaquete) {
        this.costodepaquete = costodepaquete;
    }
    public String getNombreunicodepaquete() {
        return nombreunicodepaquete;
    }
    public void setNombreunicodepaquete(String nombreunicodepaquete) {
        this.nombreunicodepaquete = nombreunicodepaquete;
    }
    public List<Servicio> getServiciosdepaquete() {
        return serviciosdepaquete;
    }
    public void setServiciosdepaquete(List<Servicio> serviciosdepaquete) {
        this.serviciosdepaquete = serviciosdepaquete;
    }




}
