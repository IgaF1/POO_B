/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intusperior.modelo;

/**
 *
 * @author 59399
 */
public class Usuario {
    
    private String Dni;
    private String nombre;
    private String fechaNaciemiento;
    private String Codigo;

    public Usuario() {
    }

    public Usuario(String Dni, String nombre, String fechaNaciemiento, String Codigo) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.fechaNaciemiento = fechaNaciemiento;
        this.Codigo = Codigo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(String fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
