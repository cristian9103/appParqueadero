package com.mycompany.borrador_parqueadero.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Precio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipoVehiculo;
    private double valorHora, valorMensual, valorDia;

    public Precio() {
    }

    public Precio(int id, String tipoVehiculo, double valorHora, double valorMensual, double valorDia) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.valorHora = valorHora;
        this.valorMensual = valorMensual;
        this.valorDia = valorDia;
    }

    public Precio(String tipoVehiculo, double valorHora, double valorMensual, double valorDia) {
        this.tipoVehiculo = tipoVehiculo;
        this.valorHora = valorHora;
        this.valorMensual = valorMensual;
        this.valorDia = valorDia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(double valorMensual) {
        this.valorMensual = valorMensual;
    }
    
    public double getValorDia(){
        return valorDia;
    }
    
    public void setValorDia(double valorDia){
        this.valorDia = valorDia;
    }
    
}
