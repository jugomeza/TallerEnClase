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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad u = new Universidad("Universidad Nacional de Colombia");
        u.RegistrarSedeT("Palmira", "calle 44 c 22 11", 392877, 890);
        u.RegistrarSedeE("Orinoquia", "calle 49 m 23 33", 42112332,323, "ingenieria de sistemas");
        u.listaSedes.get(0).añadirProgramaFormacion("TECNOLOGICO", "INGENIERIA INDUSTRIAL", "EL PROGRAMA ESTA ORIENTADO A DESARROLLAR LAS COMPETENCIAS DEL ESTUDIANTE PARA QUE SE PUEDA DESEMVOLVER EN DIFERENTES CAMPOS");
        EstudianteBachiller J = new EstudianteBachiller("Jose","Ramirez","Reservori oca",2019);
        u.listaSedes.get(0).mostrarInfo();
        u.listaSedes.get(0).getEstudiantesMatriculados();
// TODO code application logic here
    }
    
}
