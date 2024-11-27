package com.mycompany.borrador_parqueadero.logica;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import com.mycompany.borrador_parqueadero.Persistencia.ControladoraPersistencia;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    Mensualidad mensu;

    public void agregarvehiculo(String placa, String tipo_Vehiculo, String estado, String fecha, String hora_Salida) {

        Vehiculo vehi = new Vehiculo();
        vehi.setPlaca(placa);
        vehi.setTipo_Vehiculo(tipo_Vehiculo);
        vehi.setEstado(estado);
        vehi.setHora_Ingreso(fecha);
        vehi.setHora_Salida(hora_Salida);

        controlPersis.agregarVehiculo(vehi);
    }

    public List<Vehiculo> traerVehiculos() {
        return controlPersis.traerVehiculos();
    }

    public List<Vehiculo> traerTipoVehiculos(String tipoVehiculo, String placa, String estado, String fecha) {
        return controlPersis.traerTipoVehiculos(tipoVehiculo, placa, estado, fecha);
    }

    public Vehiculo traerVehiculo(String placa, String estado) {
        return controlPersis.traerVehiculo(placa, estado);
    }

    public double calcularPago(String horaSalida, Vehiculo vehi) {
        Precio moto = controlPersis.traerPrecio(2);
        Precio carro = controlPersis.traerPrecio(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime fechaEntrada = LocalDateTime.parse(vehi.getHora_Ingreso(), formatter);
        LocalDateTime fechaSalida = LocalDateTime.parse(horaSalida, formatter);

        Duration duracion = Duration.between(fechaEntrada, fechaSalida);

        double horas = duracion.toHours() + 1;
        double minutos = duracion.toMinutes() % 60;
        int horasInt = (int) horas;

        if (horas > 7 && vehi.getTipo_Vehiculo().equals("MOTOCICLETA")) {
            return moto.getValorDia() * (horasInt / 24 + 1);
        } else if (horas > 7 && vehi.getTipo_Vehiculo().equals("AUTOMÓVIL")) {
            return carro.getValorDia() * (horasInt / 24 + 1);
        }

        if (vehi.getTipo_Vehiculo().equals("MOTOCICLETA")) {
            return moto.getValorHora() * horas;
        } else if (vehi.getTipo_Vehiculo().equals("AUTOMÓVIL")) {
            return carro.getValorHora() * horas;
        }

        return 0;
    }

    public void sacarVehiculo(Vehiculo vehi, double valorPagar, String fechaSalida) {
        vehi.setHora_Salida(fechaSalida);
        vehi.setValor_Pagado(valorPagar);
        vehi.setEstado("POR FUERA");
        controlPersis.sacarVehiculo(vehi);
    }

    //Metodos Propietario
    public void agregarPropietario(String placa, String cedula, String propietario, String telefono, String tipo_Vehiculo) {
        List<Mensualidad> listaMensualidades = new ArrayList<Mensualidad>();
        Propietario propi = new Propietario(placa, propietario, tipo_Vehiculo, cedula, telefono, listaMensualidades);
        controlPersis.agregarPropietario(propi);
    }

    public List<Propietario> traerTipoPropietario(String tipoVehiculo, String placa, String propietario) {
        return controlPersis.traerTipoPropietario(tipoVehiculo, placa, propietario);
    }

    public List<Propietario> traerPropietarioPorFecha(String fecha) {
        return controlPersis.getEmpleadosPorFecha(fecha);
    }

    public Propietario traerPropietario(String placa) {
        return controlPersis.traerPropietario(placa);
    }

    public List<Vehiculo> traerVehiculosEntreFechas(String fechaInicio, String fechaFin) {
        return controlPersis.traerVehiculosEntreFechas(fechaInicio, fechaFin);
    }

    public void actualizarPropietario(Propietario propietario) {
        controlPersis.editarPropietario(propietario);
    }

    //Métodos Mensualidad
    public void agregarMensualidad(String fecha_Inicio, String fecha_Final, String estadoMensualidad, double valor_Mensual, String placa) {
        Propietario propi = controlPersis.traerPropietario(placa);
        mensu = new Mensualidad(fecha_Inicio, fecha_Final, estadoMensualidad, valor_Mensual, propi);
        controlPersis.agregarMensualidad(mensu);

        List<Mensualidad> listaMensualidades = new ArrayList<Mensualidad>();
        listaMensualidades.add(mensu);
        propi.setListaMensualidades(listaMensualidades);
        propi.getListaMensualidades().add(mensu);

        controlPersis.editarPropietario(propi);
    }

    public void pagarMensualidad(String fecha_Inicio, String fecha_Final, String estadoMensualidad, double valor_Mensual, String placa) {
        Propietario propi = controlPersis.traerPropietario(placa);
        mensu = new Mensualidad(fecha_Inicio, fecha_Final, estadoMensualidad, valor_Mensual, propi);
        controlPersis.pagarMensualidad(mensu);
        propi.getListaMensualidades().add(mensu);

        controlPersis.editarPropietario(propi);
    }

    public List<Mensualidad> buscarMensualidadPorFecha(String fecha) {
        return controlPersis.buscarMensualidadPorFecha(fecha);
    }

    public void actualizarMensualidad(Mensualidad mensu) {
        controlPersis.actualizarMensualidad(mensu);
    }

    public List<Mensualidad> traerMensualidadEntreFechas(String fechaInicio, String fechaFinal) {

        return controlPersis.traerMensualidadEntreFechas(fechaInicio, fechaFinal);

    }

    public List<Propietario> traerTodosPropietarios() {

        return controlPersis.traerTodosPropietarios();

    }

    public List<Vehiculo> traerTodosVehiculos() {
        return controlPersis.traerTodosVehiculos();
    }

    public void ImprimirIngreso(String placa, String tipo_Vehiculo, String fecha) {

        PrinterMatrix printer = new PrinterMatrix();

        Extenso e = new Extenso();
        e.setNumber(101.85);
        printer.setOutSize(17, 48);
        printer.printCharAtCol(6, 1, 48, "-");
        printer.printCharAtCol(14, 1, 48, "-");
        printer.printTextWrap(1, 2, 15, 48, "INGRESO VEHÍCULOS");
        printer.printTextWrap(2, 2, 15, 48, "Parqueadero el Sol");
        printer.printTextWrap(3, 2, 14, 48, "Dir: Cll 65 # 65-17");
        printer.printTextWrap(4, 2, 16, 48, "Tel: 3217847823");
        printer.printTextWrap(6, 3, 1, 48, "Placa:");
        printer.printTextWrap(6, 3, 42, 48, placa);
        if (tipo_Vehiculo.equals("MOTOCICLETA")) {
            printer.printTextWrap(8, 3, 1, 48, "Tipo Vehículo:");
            printer.printTextWrap(8, 3, 37, 48, tipo_Vehiculo);
        } else {
            printer.printTextWrap(8, 3, 1, 48, "Tipo Vehículo:");
            printer.printTextWrap(8, 3, 39, 48, tipo_Vehiculo);
        }
        printer.printTextWrap(10, 3, 1, 48, "Fecha Ingreso:");
        printer.printTextWrap(10, 3, 38, 48, fecha.substring(0, 10));
        printer.printTextWrap(12, 3, 1, 48, "Hora Ingreso:");
        printer.printTextWrap(12, 3, 40, 48, fecha.substring(11, 19));
        printer.printTextWrap(16, 3, 12, 48, "Gracias por preferirnos");

        printer.toFile("Impresion.txt");

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("Impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();

            try {
                printJob.print(document, attributeSet);
            } catch (Exception ex) {
                System.out.println("Error: " + ex.toString());
            }
        } else {
            System.err.println("No hay un impresora instalada");
        }

    }

    public void ImprimirSalida(String placa, String fechaSalida, double valorPagar, String tipo_Vehiculo, String hora_Ingreso) {

        PrinterMatrix printer = new PrinterMatrix();

        DecimalFormat formater = new DecimalFormat("###,###");

        Extenso e = new Extenso();
        e.setNumber(101.85);
        printer.setOutSize(21, 48);
        printer.printCharAtCol(6, 1, 48, "-");
        printer.printCharAtCol(15, 1, 48, "-");
        printer.printCharAtCol(17, 1, 48, "-");
        printer.printTextWrap(1, 2, 16, 48, "SALIDA VEHÍCULOS");
        printer.printTextWrap(2, 2, 15, 48, "Parqueadero el Sol");
        printer.printTextWrap(3, 2, 14, 48, "Dir: Cll 65 # 65-17");
        printer.printTextWrap(4, 2, 16, 48, "Tel: 3217847823");
        printer.printTextWrap(6, 3, 1, 48, "Placa:");
        printer.printTextWrap(6, 3, 42, 48, placa);
        if (tipo_Vehiculo.equals("MOTOCICLETA")) {
            printer.printTextWrap(8, 3, 1, 48, "Tipo Vehículo:");
            printer.printTextWrap(8, 3, 37, 48, tipo_Vehiculo);
        } else {
            printer.printTextWrap(8, 3, 1, 48, "Tipo Vehículo:");
            printer.printTextWrap(8, 3, 39, 48, tipo_Vehiculo);
        }
        printer.printTextWrap(10, 3, 1, 48, "Fecha Ingreso:");
        printer.printTextWrap(10, 3, 29, 48, hora_Ingreso);
        printer.printTextWrap(12, 3, 1, 48, "Fecha Salida:");
        printer.printTextWrap(12, 3, 29, 48, fechaSalida);
        printer.printTextWrap(15, 3, 1, 48, "Valor a pagar:");
        printer.printTextWrap(15, 3, 39, 48, "$" + formater.format(valorPagar));
        printer.printTextWrap(19, 3, 12, 48, "Gracias por preferirnos");

        printer.toFile("Impresion.txt");

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("Impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();

            try {
                printJob.print(document, attributeSet);
            } catch (Exception ex) {
                System.out.println("Error: " + ex.toString());
            }
        } else {
            System.err.println("No hay un impresora instalada");
        }

    }

    public void ImprimirCierreTotal(String fechaInicioMensu, String fechaFinalMensu, double totalVehi, double totalMensu) {

        PrinterMatrix printer = new PrinterMatrix();
        DecimalFormat formater = new DecimalFormat("###,###");
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaActual = formateador.format(fecha);

        Extenso e = new Extenso();
        e.setNumber(101.85);
        printer.setOutSize(17, 48);
        printer.printCharAtCol(6, 1, 48, "-");
        printer.printCharAtCol(9, 1, 48, "-");
        printer.printCharAtCol(13, 1, 48, "-");
        printer.printCharAtCol(15, 1, 48, "-");
        printer.printTextWrap(1, 2, 17, 48, "CIERRE DE CAJA");
        printer.printTextWrap(2, 2, 15, 48, "Parqueadero el Sol");
        printer.printTextWrap(3, 2, 14, 48, "Dir: Cll 65 # 65-17");
        printer.printTextWrap(4, 2, 16, 48, "Tel: 3217847823");
        printer.printTextWrap(6, 3, 15, 48, "Desde: " + fechaInicioMensu);
        printer.printTextWrap(7, 3, 15, 48, "Hasta: " + fechaFinalMensu);
        printer.printTextWrap(9, 3, 1, 48, "Cierre Vehiculos:");
        printer.printTextWrap(9, 3, 37, 48, "$" + formater.format(totalVehi));
        printer.printTextWrap(11, 3, 1, 48, "Cierre Mensualidades:");
        printer.printTextWrap(11, 3, 37, 48, "$" + formater.format(totalMensu));
        printer.printTextWrap(13, 3, 1, 48, "Cierre Total:");
        printer.printTextWrap(13, 3, 37, 48, "$" + formater.format(totalVehi + totalMensu));
        printer.printTextWrap(15, 3, 1, 48, "Fecha Emisión:");
        printer.printTextWrap(15, 3, 38, 48, fechaActual);

        printer.toFile("Impresion.txt");

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("Impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();

            try {
                printJob.print(document, attributeSet);
            } catch (Exception ex) {
                System.out.println("Error: " + ex.toString());
            }
        } else {
            System.err.println("No hay un impresora instalada");
        }
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    return usu;
                } else {
                    return null;
                }
            } else {
                usr = null;
            }
        }
        return usr;
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearRol(String usuario, String contra, String rolRecibido) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);

        Rol rolEncontrado;
        rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null) {
            usu.setUnRol(rolEncontrado);
        }
        controlPersis.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();

        for (Rol rol : listaRoles) {
            if (rol.getNombreRol().equals(rolRecibido)) {
                return rol;
            }
        }
        return null;
    }
    
//    public void crearUsuario(){
//        List<Usuario> listaUsuarios = new ArrayList<>();
//        Rol rol = new Rol();
//        rol.setNombreRol("USER");
//        rol.setDescripcion("Rol para usuarios");
//        rol.setListaUsuarios(listaUsuarios);
//        controlPersis.agregarRol(rol);
//        
//        Usuario usu = new Usuario();
//        usu.setNombreUsuario("Cristian");
//        usu.setContrasenia("123");
//        usu.setUnRol(rol);
//        controlPersis.crearUsuario(usu);
//        
//        List<Usuario> listaUsuarios2 = new ArrayList<>();
//        listaUsuarios2.add(usu);
//        rol.setListaUsuarios(listaUsuarios);
//        rol.getListaUsuarios().add(usu);
//        
//        controlPersis.editarRol(rol);
//    }

    public List<Precio> traerPrecios() {
        return controlPersis.traerPrecios();
    }

    public Precio traerPrecio(int id) {
        return controlPersis.traerPrecio(id);
    }

    public void editarPrecio(Precio pre, double valorHora, double valorDia, double valorMensu) {
        pre.setValorHora(valorHora);
        pre.setValorDia(valorDia);
        pre.setValorMensual(valorMensu);
        
        controlPersis.editarPrecio(pre);
    }

}
