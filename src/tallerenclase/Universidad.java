package tallerenclase;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Universidad {

    public String nombre;
    ArrayList<Sede> listaSedes = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void RegistrarSedeT(String nombre, String direccion, int telefono, double areaConstruida) {
        listaSedes.add(new Tecnologico(nombre, direccion, telefono, areaConstruida));

    }

    public void RegistrarSedeP(String nombre, String direccion, int telefono, double areaConstruida, int nprogramasC) {
        listaSedes.add(new Profesional(nombre, direccion, telefono, areaConstruida, nprogramasC));

    }

    public void RegistrarSedeE(String nombre, String direccion, int telefono, double areaConstruida, String cursoM) {
        listaSedes.add(new EducacionContinua(nombre, direccion, telefono, areaConstruida, cursoM));

    }

    public void EliminarSede(int s) {
        listaSedes.remove(s);
    }

    public void ConsultarSede(int s) {
        listaSedes.get(s).mostrarInfo();
    }

    public void ModificarSede(int s, double area, int tel, String nombre, String direccion) {
        listaSedes.get(s).setAreaConstruida(area);
        listaSedes.get(s).setDireccion(direccion);
        listaSedes.get(s).setNombre(nombre);
        listaSedes.get(s).setTelefono(tel);

    }

    public void darInformacion() {
        for (int i = 0; i <= listaSedes.size(); i++) {
            listaSedes.get(i).mostrarInfo();
        }
    }

}
