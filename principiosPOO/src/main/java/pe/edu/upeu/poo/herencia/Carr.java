/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.herencia;

/**
 *
 * @author Datos
 */
public class Carr extends Vehicle{
    private String modelo =  "chevrolet";// car atributo
    
    private void aplicarHerencia(){
        System.out.println("la marca es:"+marca);
        System.out.println("este carro es de marca " + marca+" y el modelo es:"+modelo);
        sonido();
    }
    public static void main(String[] args){
        new Carr().aplicarHerencia();
    }   
    
}
