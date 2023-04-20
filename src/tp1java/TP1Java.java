/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class TP1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Perro variable1 = new Perro("Amapola","doberman","grande","marron");
        Perro variable2 = new Perro("Otto","salchicha","chiquito","marron");
        
        
        List<Perro> perros = new ArrayList<Perro>();
        perros.add(variable1);
        
        
        Dueño a = new Dueño("Juan",21, perros);
        
        System.out.println("ANTES DE AGREGAR");
        a.mostrarDatos();
        
        a.getPerros().add(variable2);
        
        System.out.println("DFESPUES DE AGREGAR");
        a.mostrarDatos();
        
        Registro registro1 = new Registro("Patitas Felices",12345, variable1);
        //variable1.ladrar();
        //variable1.tomar_agua();
    }
}
