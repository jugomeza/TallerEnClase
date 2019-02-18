/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public abstract class Sede {
   protected String nombre;
   protected String direccion;
   protected int telefono;
   protected double areaConstruida;
   ArrayList <ProgramaFormacion> listaProgramas = new ArrayList<>();

    public Sede(String nombre, String direccion, int telefono, double areaConstruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaConstruida = areaConstruida;
        
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
   public void añadirProgramaFormacion(String tipo, String nombre, String descripcion){
   listaProgramas.add(new ProgramaFormacion(tipo,nombre,descripcion));}
   public void eliminarProgramaFormacion(int s){
   listaProgramas.remove(s);
   }
   public void mostrarInfo(){
       System.out.println("Nombre: "+nombre+"\n Direccion: "+direccion+"\n Telefóno: "+telefono+"\n Area Construida: "+areaConstruida+"\n Programas");
       for(int i=0;i<listaProgramas.size();i++){listaProgramas.get(i).mostrarDatos();}
   }
     public void getEstudiantesMatriculados(){System.out.println( listaProgramas.size());}
    
}
