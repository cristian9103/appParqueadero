 package com.mycompany.borrador_parqueadero.Persistencia;

import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import com.mycompany.borrador_parqueadero.logica.Precio;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import com.mycompany.borrador_parqueadero.logica.Rol;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import com.mycompany.borrador_parqueadero.logica.Vehiculo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    VehiculoJpaController vehiJpa = new VehiculoJpaController();
    PropietarioJpaController propiJpa = new PropietarioJpaController();
    MensualidadJpaController mensuJpa = new MensualidadJpaController();
    RolJpaController rolJpa = new RolJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    PrecioJpaController preJpa = new PrecioJpaController();
    
    //Métodos Vehiculo
    public void agregarVehiculo(Vehiculo parq) {
        vehiJpa.create(parq);
    }

    public List<Vehiculo> traerVehiculos() {
        return vehiJpa.findVehiculoEntities();
    }

    public List<Vehiculo> traerTipoVehiculos(String tipoVehiculo,String placa,String estado,String fecha) {
        return vehiJpa.traerVehiculos(tipoVehiculo,placa,estado,fecha);
    }

    public Vehiculo traerVehiculo(String placa,String estado) {
        return vehiJpa.traerVehiculo(placa,estado);
    }

    public void sacarVehiculo(Vehiculo vehi) {
        try {
            vehiJpa.edit(vehi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Vehiculo> traerVehiculosEntreFechas(String fechaInicio, String fechaFin) {
        return vehiJpa.traerVehiculosEntreFechas(fechaInicio, fechaFin);
    }
    
    //Metodos de Propietario

    public void agregarPropietario(Propietario propi) {
        propiJpa.create(propi);
    }

    public List<Propietario> traerTipoPropietario(String tipoVehiculo, String placa,String propietario) {
        return propiJpa.traerPropietarios(tipoVehiculo, placa, propietario);
    }

    public List<Propietario> getEmpleadosPorFecha(String fecha) {
        return propiJpa.traerPropietarioPorFecha(fecha);
    }

    public Propietario traerPropietario(String placa) {
        return propiJpa.traerPropietario(placa);
    }

    public void editarPropietario(Propietario propietario) {
        try {
            propiJpa.edit( propietario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Métodos Mensualidad
    public void agregarMensualidad(Mensualidad mensu) {
        mensuJpa.create(mensu);
    }

    public List<Mensualidad> buscarMensualidadPorFecha(String fecha) {
        return mensuJpa.buscarMensualidadPorFecha(fecha);
    }

    public void actualizarMensualidad(Mensualidad mensu) {
        try {
            mensuJpa.edit(mensu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pagarMensualidad(Mensualidad mensu) {
        mensuJpa.create(mensu);
    }

    public List<Mensualidad> traerMensualidadEntreFechas(String fechaInicio, String fechaFinal) {
        return mensuJpa.traerMensualidadEntreFechas(fechaInicio, fechaFinal);
    }

    public List<Propietario> traerTodosPropietarios() {
        return propiJpa.findPropietarioEntities();
    }

    public List<Vehiculo> traerTodosVehiculos() {

        return vehiJpa.findVehiculoEntities();
    }

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public void agregarRol(Rol rol) {

        rolJpa.create(rol);
    }

    public void editarRol(Rol rol) {
        try {
            rolJpa.edit(rol);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Precio> traerPrecios() {
        return preJpa.findPrecioEntities();
    }

    public void crearPrecio(Precio pre) {
        preJpa.create(pre);
    }

    public Precio traerPrecio(int id) {
        return preJpa.findPrecio(id);
    }

    public void editarPrecio(Precio pre) {
        try {
            preJpa.edit(pre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
