/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase;

/**
 *
 * @author sebas
 */
public class EstudianteBachiller {
    public String nombre;
    public String apellido;
    public String colegio;
    public int año;
    

    public EstudianteBachiller(String nombre, String apellido, String colegio, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
