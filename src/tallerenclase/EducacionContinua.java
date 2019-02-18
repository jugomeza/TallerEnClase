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
public class EducacionContinua extends Sede {
    protected String CursoMasPopular;
    public EducacionContinua(String nombre, String direccion, int telefono, double areaConstruida,String cursoM){
        super(nombre,direccion,telefono,areaConstruida);
        this.CursoMasPopular = cursoM;
    }
    
    public String getCursoMasPopular(){return CursoMasPopular;}
    public void setCursoMasPopular(String cursoM){this.CursoMasPopular = cursoM;}
      
              
              
              
              
              
              
              
              
              
              
              
}
