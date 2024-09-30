package herencia;

public class Consultor extends Persona{
    String nombre_consultora;
    int n_consultor;

    public Consultor() {
    }

    public Consultor(String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_consultora, int n_consultor) {
        super(dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.n_consultor = n_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getN_consultor() {
        return n_consultor;
    }

    public void setN_consultor(int n_consultor) {
        this.n_consultor = n_consultor;
    }
}
