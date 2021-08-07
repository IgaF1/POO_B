/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intusperior.vista;

import ec.edu.intusperior.modelo.Autor;
import ec.edu.intusperior.modelo.Biblioteca;
import ec.edu.intusperior.modelo.Libro;
import ec.edu.intusperior.modelo.Usuario;

/**
 *
 * @author 59399
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        Autor au1 = new Autor("Andres Flores","1712134856","15/01/2009");
        Libro li1 = new Libro("ISBN2021-1", "El Machay","INT-SUPERIOR", au1);
        Usuario user = new Usuario("1712934852", "Mery Gomez","24/07/1994","USER-097");
        Biblioteca biblio1 = new Biblioteca("EL Triunfo", "INTI ÑAÑ S/N ", li1, 40, user);
        
        
        
        
        System.out.println("Cual es el autor del libro 1: "+li1.getAutor().getNombre()+
                "\nEL DNI del autor del libro 1 es: "+li1.getAutor().getDNI());
        
        System.out.println("La biblioteca 1 es: "+biblio1.getNombre()+
                "\nEl libro de es biblioteca es : "+biblio1.getLibro().getTitulo());
        
        
        
    }
}
