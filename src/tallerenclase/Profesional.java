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
public class Profesional extends Sede {
    protected int NumeroProgramasAltaCalidad;
    public Profesional(String nombre, String direccion, int telefono, double areaConstruida,int nprogramasC){
    super(nombre,direccion,telefono,areaConstruida);
    this.NumeroProgramasAltaCalidad = nprogramasC;
    }
    
    public int getNumeroProgramasAltaCalidad(){ return NumeroProgramasAltaCalidad;}
      
}
