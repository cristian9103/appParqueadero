package com.mycompany.borrador_parqueadero.logica;

import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-19T15:55:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, String> tipo_Vehiculo;
    public static volatile SingularAttribute<Propietario, String> cedula;
    public static volatile ListAttribute<Propietario, Mensualidad> listaMensualidades;
    public static volatile SingularAttribute<Propietario, Integer> id;
    public static volatile SingularAttribute<Propietario, String> telefono;
    public static volatile SingularAttribute<Propietario, String> nombre;
    public static volatile SingularAttribute<Propietario, String> placa;

}