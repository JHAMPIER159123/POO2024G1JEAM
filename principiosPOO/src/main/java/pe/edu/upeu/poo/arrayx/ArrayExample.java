/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.arrayx;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    static List<Persona> personas=new ArrayList<>();
    
public static void main (String [] args){
    Persona p=new Persona();
    p.setDni("01221653");
    p.setNombre("Pepe");
    p.setEdad(19);
    p.setApellido("Aguilar");
    personas.add(p);
    p=new Persona();
    p.setDni("41425194");
    p.setNombre("Milaneso");
    p.setEdad(21);
    p.setApellido("Mamani");
    personas.add(p);
    
   for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("DNI: " + persona.getDni());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println();
        }
}
}
