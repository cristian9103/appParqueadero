package com.mycompany.borrador_parqueadero.logica;

import com.mycompany.borrador_parqueadero.logica.Propietario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-19T15:55:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mensualidad.class)
public class Mensualidad_ { 

    public static volatile SingularAttribute<Mensualidad, String> estado;
    public static volatile SingularAttribute<Mensualidad, String> fecha_Fin;
    public static volatile SingularAttribute<Mensualidad, Double> valor_Mensual;
    public static volatile SingularAttribute<Mensualidad, Propietario> propi;
    public static volatile SingularAttribute<Mensualidad, Integer> id;
    public static volatile SingularAttribute<Mensualidad, String> fecha_Inicio;

}