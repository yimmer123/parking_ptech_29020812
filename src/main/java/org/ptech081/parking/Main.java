package org.ptech081.parking;
import org.petch081.parking.emtities.*;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[]args) {
        //crear carro con los constructores:
        Carro carrito1 = new Carro("KDO 234",
                                       TipoVehiculo.MOTO);
        Carro carrito2 = new Carro();
        carrito2.placa="AST 789";
        carrito2.tipoVehiculo= TipoVehiculo.CAMIONETA;
        // crear cliente
        Cliente cliente1=new Cliente("Sofia", "Diaz", 1234563L);  
         // crear cliente
         Cliente cliente2=new Cliente("Felipe", "Gomez", 4567834L); 
         //crear empleado
         Empleado empleado1=new Empleado( "Jose", 1357967L );


         Empleado empleado2=new Empleado( "Maria", 7653862L );
        //invocar el metodo add car
        cliente1.addCar(carrito1);
        cliente1.addCar("ABC 908",TipoVehiculo.BUS);
        //Crear dos cupos
        Cupoo cupo1=new Cupoo('A');
        Cupoo cupo2=new Cupoo('B');
        //Crear 2 registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.JUNE, 24);
        LocalTime horaFin = LocalTime.of(15, 30, 0);


        List<Registroo> misRegistros = new ArrayList<Registroo>();
        //Crear Registro
        Registroo registro1 = new Registroo(fechaInicio, horaInicio, fechaFin, horaFin, 5000L, cupo1, cliente1.misCarros.get(0),cliente1, empleado1);

        LocalDate fechaInicio2 = LocalDate.now();
        LocalTime horaInicio2 = LocalTime.now();
        LocalDate fechaFin2 = LocalDate.of(2024, Month.DECEMBER, 29);
        LocalTime horaFin2 = LocalTime.of(12, 20, 0);
        
        Registroo registro2 = new Registroo(fechaInicio2, horaInicio2, fechaFin2, horaFin2, 8000L, cupo2, cliente2.misCarros.get(1),cliente2, empleado2);

        //añadir el registro a la lista
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        System.out.println("Registros de E/S Parking");
        for(Registroo r : misRegistros ){
            System.out.println("Cliente " + r.cliente.nombre + " " + r.cliente.apellido + "|" + r.carro.placa + " " +  r.carro.tipoVehiculo + "|" + r.valor + "|" + r.fechaInicio + " " + r.horaInicio + "|" + r.empleado.nombre + " " + r.empleado.codigo + " ");



        }


    }
}