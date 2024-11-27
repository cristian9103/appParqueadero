package com.mycompany.borrador_parqueadero.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mensualidad implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fecha_Inicio, fecha_Fin, estado;
    double valor_Mensual;
    
    @ManyToOne
    Propietario propi;

    public Mensualidad() {
    }

    public Mensualidad(int id, String fecha_Inicio, String fecha_Fin, String estado, double valor_Mensual, Propietario propi) {
        this.id = id;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
        this.estado = estado;
        this.valor_Mensual = valor_Mensual;
        this.propi = propi;
    }

    public Mensualidad(String fecha_Inicio, String fecha_Fin, String estado, double valor_Mensual, Propietario propi) {
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
        this.estado = estado;
        this.valor_Mensual = valor_Mensual;
        this.propi = propi;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public String getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor_Mensual() {
        return valor_Mensual;
    }

    public void setValor_Mensual(double valor_Mensual) {
        this.valor_Mensual = valor_Mensual;
    }

    public Propietario getPropi() {
        return propi;
    }

    public void setPropi(Propietario propi) {
        this.propi = propi;
    }

    @Override
    public String toString() {
        return "Mensualidad{" + "id=" + id + ", fecha_Inicio=" + fecha_Inicio + ", fecha_Fin=" + fecha_Fin + ", estado=" + estado + ", valor_Mensual=" + valor_Mensual + ", propi=" + propi + '}';
    }
    
    
}
