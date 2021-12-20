package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Servicio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-20T13:02:38")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile SingularAttribute<Paquete, Integer> idpaquete;
    public static volatile SingularAttribute<Paquete, Float> costodepaquete;
    public static volatile SingularAttribute<Paquete, String> nombreunicodepaquete;
    public static volatile ListAttribute<Paquete, Servicio> serviciosdepaquete;

}