/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Universidad> universidades = new ArrayList<>();
        ArrayList<EstudianteBachiller> listaE = new ArrayList<>();
        int i = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        int x = 0;

        Scanner leer = new Scanner(System.in);

        while (i >= 0) {
            while (i > 8) {
                System.out.println("no es una opcion valida");
                System.out.println("Desea:\n1)Crear una universidad.\n2)Registrar una sede.\n3)Eliminar una sede.\n4)Consultar sede.\n5)Modificar una sede.\n6)Añadir un Programa de formacion.\n7)Definir un estudiante.\n8)Matricular un estudiante.");
                i = leer.nextInt();
            }
            System.out.println("Desea:\n1)Crear una universidad.\n2)Registrar una sede.\n3)Eliminar una sede.\n4)Consultar sede.\n5)Modificar una sede.\n6)Añadir un Programa de formacion.\n7)Definir un estudiante.\n8)Matricular un estudiante.");
            i = leer.nextInt();

            switch (i) {
                case 1:
                    System.out.println("ingrese nombre de la universidad");
                    System.out.println("hola mundo");
                    String nombre = leer.next();
                    universidades.add(new Universidad(nombre));
                    break;
                case 2:
                    System.out.println("ingrese la opcion del tipo de sede\n1)Tecnologica.\n2)Profesional.\n3)Educacion Continua.");
                    a = leer.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("Ahora ingrese el numero de creacion universidad, el nombre de la sede, la direccion de la sede, el telefono de la sede, el area de Construccion de la cede");
                            String nombreS = leer.next();
                            String direccionS = leer.next();
                            int telefonoS = leer.nextInt();
                            double areaC = leer.nextDouble();
                            universidades.get(b - 1).RegistrarSedeT(nombreS, direccionS, telefonoS, areaC);
                            break;
                        case 2:
                            System.out.println("Ahora ingrese el numero de creacion universidad, el nombre de la sede, la direccion de la sede, el telefono de la sede, el area de Construccion de la cede y el numero de programas de alta calidad");
                            String nombreS2 = leer.next();
                            String direccionS2 = leer.next();
                            int telefonoS2 = leer.nextInt();
                            double areaC2 = leer.nextDouble();
                            int programasA = leer.nextInt();
                            universidades.get(b - 1).RegistrarSedeP(nombreS2, direccionS2, telefonoS2, areaC2, programasA);
                            break;

                        case 3:
                            System.out.println("Ahora ingrese el numero de creacion universidad, el nombre de la sede, la direccion de la sede, el telefono de la sede, el area de Construccion de la cede y el mejor curso que ofrece la sede");
                            String nombreS3 = leer.next();
                            String direccionS3 = leer.next();
                            int telefonoS3 = leer.nextInt();
                            double areaC3 = leer.nextDouble();
                            String cursoM = leer.next();
                            universidades.get(b - 1).RegistrarSedeE(nombreS3, direccionS3, telefonoS3, areaC3, cursoM);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("ingrese el numero de creacion universidad y el numero de creacion de sede,\n recuerde que al eliminar una sede los demas numeros de creacion se ajustan");
                    a = leer.nextInt();
                    b = leer.nextInt();
                    universidades.get(a - 1).EliminarSede(b - 1);
                    break;
                case 4:
                    System.out.println("ingrese el numero de creacion de la univerrsidad y posteriormene el numero de la sede que quiere consultar");
                    a = leer.nextInt();
                    b = leer.nextInt();
                    universidades.get(a - 1).ConsultarSede(b - 1);
                    break;
                case 5:
                    System.out.println("ingrese el numero de creacion de universidad, numero de creacion de sede, area, telefono, nombre, direccion");
                    a = leer.nextInt();
                    b = leer.nextInt();
                    double area = leer.nextDouble();
                    int tel = leer.nextInt();
                    String nombre4 = leer.next();
                    String direccion = leer.next();
                    universidades.get(a - 1).ModificarSede(b - 1, area, tel, nombre4, direccion);
                    break;
                case 6:
                    System.out.println("ingrese el numero de creacion de la universidad, el numero de creaacion de la sede, el tipo , el nombre  y la descripcion ");
                    a = leer.nextInt();
                    b = leer.nextInt();
                    String tipo = leer.next();
                    String nom = leer.next();
                    String descripcion = leer.next();
                    universidades.get(a - 1).listaSedes.get(b - 1).añadirProgramaFormacion(tipo, nom, descripcion);
                    break;
                case 7:
                    System.out.println("ingrese el nombre del nuevo estudiante, el apellido del nuevo esdudiante, Colegio donde se graduo y el año en que se graduo y ");
                    String nombreE = leer.next();
                    String apellidoE = leer.next();
                    String colegioE = leer.next();
                    int añoE = leer.nextInt();
                    listaE.add(new EstudianteBachiller(nombreE, apellidoE, colegioE, añoE));
                    break;
                case 8:
                    System.out.println("ingrese el numero de universidad, numero de sede, numero de programa");
                    a = leer.nextInt();
                    b = leer.nextInt();
                    c = leer.nextInt();
                    System.out.println("ingrese el digito del estudiante");
                    int nomclave = leer.nextInt();
                    universidades.get(a - 1).listaSedes.get(b - 1).listaProgramas.get(c - 1).vincularEstudiante(listaE.get(nomclave - 1));
                    break;

            }
        }

// TODO code application logic here
    }

}
