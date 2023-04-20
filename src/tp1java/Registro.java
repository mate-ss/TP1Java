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
public class Registro {

    private String veterinaria;
    private int NumeroDeIdentidad;
    private Perro perro;

    public void Almacenar() {
        System.out.println(this.veterinaria + " almacena los datos e historial del perro");
    }

    public Registro(String veterinaria, int NumeroDeIdentidad, Perro perro) {
        this.veterinaria = veterinaria;
        this.NumeroDeIdentidad = NumeroDeIdentidad;
        this.perro = perro;
    }
    public void x(){
        System.out.println(perro.getNombre());
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro Perro) {
        this.perro = perro;
    }

    public String getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(String veterinaria) {
        this.veterinaria = veterinaria;
    }

    public int getNumeroDeIdentidad() {
        return NumeroDeIdentidad;
    }

    public void setNumeroDeIdentidad(int NumeroDeIdentidad) {
        this.NumeroDeIdentidad = NumeroDeIdentidad;
    }

}
