package org.ptech081.parking.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {


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



    //Constructor por defecto
    public Registro(){
    }
    //Contructor de todo
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, long valor, Cupoo cupo, Carro carro, Cliente cliente){
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
    }
    }
    
    

