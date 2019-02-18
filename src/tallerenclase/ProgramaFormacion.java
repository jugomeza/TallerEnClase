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
public class ProgramaFormacion {

    public String tipo;
    public String nombre;
    public String descripcion;
    ArrayList<EstudianteBachiller> listaEstudiantes = new ArrayList<>();

    public ProgramaFormacion() {
    }

    public ProgramaFormacion(String tipo, String nombre, String descripcion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void vincularEstudiante(EstudianteBachiller e) {
        listaEstudiantes.add(e);
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo + "\n Nombre: " + nombre + "\n Descripcion: " + descripcion);
    }

}
