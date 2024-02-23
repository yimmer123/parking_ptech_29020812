package org.ptech081.parking.entities;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
public String nombre;
public String apellido;
public Long identificacion;
public List<Carro> misCarros;

public Cliente(){
    this.misCarros = new ArrayList<Carro>();
}
public Cliente(String nombre, String apellido, Long identificacion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.identificacion = identificacion;
    this.misCarros = new ArrayList<Carro>();
}
 //primera sobrecarga add car
 public void addCar(Carro car){
    this.misCarros.add(car);

 }
 //segunda sobrecarga addcar
 public void addCar(String placa, TipoVehiculo tv){
    Carro car = new Carro(placa,tv);
    this.misCarros.add(car);

 }
}
