/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1java;
/**
 *
 * @author Alumno
 */
public class Raza_de_perro {
    private String raza;
    private String tamaño;
    private String color;

    public void tomar_agua() {
        System.out.println(this.raza + "está tomando agua");
    }

    public void ladrar() {
        System.out.println("guaf guaf");
    }
    public Raza_de_perro(String raza, String tamaño, String color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}