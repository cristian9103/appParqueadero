package com.mycompany.borrador_parqueadero.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String placa, tipo_Vehiculo, estado;
    private String hora_Ingreso, hora_Salida;
    private double valor_Pagado;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String tipo_Vehiculo, String estado, String hora_Ingreso, String hora_Salida, double valor_Pagado) {
        this.id = id;
        this.placa = placa;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.estado = estado;
        this.hora_Ingreso = hora_Ingreso;
        this.hora_Salida = hora_Salida;
        this.valor_Pagado = valor_Pagado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora_Ingreso() {
        return hora_Ingreso;
    }

    public void setHora_Ingreso(String hora_Ingreso) {
        this.hora_Ingreso = hora_Ingreso;
    }

    public String getHora_Salida() {
        return hora_Salida;
    }

    public void setHora_Salida(String hora_Salida) {
        this.hora_Salida = hora_Salida;
    }

    public double getValor_Pagado() {
        return valor_Pagado;
    }

    public void setValor_Pagado(double valor_Pagado) {
        this.valor_Pagado = valor_Pagado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", placa=" + placa + ", tipo_Vehiculo=" + tipo_Vehiculo + ", estado=" + estado + ", hora_Ingreso=" + hora_Ingreso + ", hora_Salida=" + hora_Salida + ", valor_Pagado=" + valor_Pagado + '}';
    }
}
