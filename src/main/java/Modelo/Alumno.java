package Modelo;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno(int id, String nombre, String apellido, int i) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {
    }

    public void mostrarNombre(){
        System.out.println("Hola, mi nombre es: "+ nombre);
    }

    public void saberAprobado(double calificacion){

        if(calificacion >= 5){
            System.out.println("Aprobé con: "+ calificacion);
        }else{
            System.out.println("Reaprobé con: "+ calificacion);
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}
