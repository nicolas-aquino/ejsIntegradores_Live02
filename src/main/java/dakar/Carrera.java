package dakar;

import java.util.LinkedList;
import java.util.List;

public class Carrera {
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculos;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos){
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculos = new LinkedList<>();
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
        vehiculos.add(new Auto());
    }
    public void darDeAltaMoto(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
        vehiculos.add()
    }
    public void eliminarVehiculo(Vehiculo vehiculo){
        
    }
    public void eliminarVehiculoConPatente(String patente){

    }
    public Vehiculo ganador(){
        return null;
    }
}
