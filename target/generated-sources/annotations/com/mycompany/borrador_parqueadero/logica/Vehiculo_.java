package com.mycompany.borrador_parqueadero.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-19T15:55:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> tipo_Vehiculo;
    public static volatile SingularAttribute<Vehiculo, String> estado;
    public static volatile SingularAttribute<Vehiculo, Double> valor_Pagado;
    public static volatile SingularAttribute<Vehiculo, String> hora_Salida;
    public static volatile SingularAttribute<Vehiculo, Integer> id;
    public static volatile SingularAttribute<Vehiculo, String> hora_Ingreso;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}