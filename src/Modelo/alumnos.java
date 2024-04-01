/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class alumnos implements Comparable<alumnos> {
    
    String dni;
    String modulo;
    double nota;
    String provincia;

    public alumnos(String dni, String modulo, double nota, String provincia) {
        this.dni = dni;
        this.modulo = modulo;
        this.nota = nota;
        this.provincia = provincia;
    }

    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int compareTo(alumnos t) {
            return dni.compareTo(t.getDni());
    }
    
    
    
}
