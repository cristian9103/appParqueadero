
package com.mycompany.borrador_parqueadero.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Propietario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; 
    private String placa, nombre, tipo_Vehiculo,cedula,telefono;
    
    @OneToMany (mappedBy = "propi")
    List<Mensualidad> listaMensualidades;

    public Propietario() {
    }

    public Propietario(int id, String placa, String nombre, String tipo_Vehiculo, String cedula, String telefono, List<Mensualidad> listaMensualidades) {
        this.id = id;
        this.placa = placa;
        this.nombre = nombre;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listaMensualidades = listaMensualidades;
    }

    public Propietario(String placa, String nombre, String tipo_Vehiculo, String cedula, String telefono, List<Mensualidad> listaMensualidades) {
        this.placa = placa;
        this.nombre = nombre;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listaMensualidades = listaMensualidades;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mensualidad> getListaMensualidades() {
        return listaMensualidades;
    }

    public void setListaMensualidades(List<Mensualidad> listaMensualidades) {
        this.listaMensualidades = listaMensualidades;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", placa=" + placa + ", nombre=" + nombre + ", tipo_Vehiculo=" + tipo_Vehiculo + ", cedula=" + cedula + ", telefono=" + telefono + ", listaMensualidades=" + listaMensualidades + '}';
    }
    
    
}
