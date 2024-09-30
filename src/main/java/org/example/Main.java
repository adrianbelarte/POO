package org.example;

import Modelo.Alumno;
import herencia.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //clases
        Alumno a2 = new Alumno(1,"Adrian", "Belarte Zapata",34);
        Alumno a1 = new Alumno();

        a2.mostrarNombre();
        a2.saberAprobado(7);

        a1.setId(2);
        a1.setNombre("javi");
        a1.setApellido("Rodriguez");
        a1.mostrarNombre();
        a1.saberAprobado(4);

        //herencias

        Empleado e1= new Empleado();
        e1.getNum_legajo();
        e1.getNombre();

    }
}