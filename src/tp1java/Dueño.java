/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1java;

import java.util.List;

/**
 *
 * @author Alumno
 */
public class Dueño {

    private String nombre;
    private int edad;
    private List<Perro> perros;
    
    public Dueño(String nombre, int edad, List<Perro> perros) {
        this.nombre = nombre;
        this.edad = edad;
        this.perros = perros;
    }
    
    public void mostrarDatos(){
        System.out.println(this.nombre);
        for(Perro perro : this.perros){
            System.out.println(perro.getNombre());
        }
    }
    
    public void Pasear() {
        System.out.println(this.nombre + " está paseandolo");
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
