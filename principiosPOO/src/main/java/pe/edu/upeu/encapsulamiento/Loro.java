/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.encapsulamiento;

/**
 *
 * @author Usuario
 */
public class Loro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Hola manito...aprendé pues");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz...Zzz....");
    }
}
