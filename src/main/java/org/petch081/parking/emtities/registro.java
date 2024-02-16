package org.petch081.parking.emtities;

import java.time.LocalDate;
import java.time.LocalTime;

public class registro {


    //
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public long valor;

    //atributos de relacion
    public Cupoo cupo;
    public Carro carro;
    public Cliente cliente;
    public Empleado empleado;


    //Constructor por defecto
    public registro(){
    }
    //Contructor de todo
    public registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, long valor, Cupoo cupo, Carro carro, Cliente cliente, Empleado empleado){
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    }
    
    

